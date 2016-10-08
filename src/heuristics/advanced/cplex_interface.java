/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristics.advanced;

import conditions.Comparison;
import conditions.Conditions;
import conditions.Predicate;
import expressions.ExtendedAddendum;
import expressions.ExtendedNormExpression;
import expressions.NumEffect;
import expressions.PDDLNumber;
import ilog.concert.IloConstraint;
import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.concert.IloNumVarType;
import ilog.concert.IloRange;
import ilog.cplex.IloCplex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import problem.GroundAction;
import problem.State;

/**
 *
 * @author enrico
 */
public final class cplex_interface extends LpInterface {

    public final HashMap<Integer, Collection<GroundAction>> affectors_of;
    public HashMap<Integer, Collection<GroundAction>> affectors_of_temp;

    public final HashMap<Conditions, Collection<GroundAction>> pos_affectors_of;
    public ArrayList<Boolean> first_time;

    public final IloCplex lp;
    public IloNumVar[] action_variables;
    public Collection<IloConstraint> constraints;
    public HashMap<Conditions, IloRange> cond_to_cplex_cond;
    public HashMap<Integer, IloNumVar> action_to_variable;
    public IloLinearNumExpr objective;

    public cplex_interface(Conditions cond, Conditions global_constraint) throws IloException {
        super(cond, global_constraint);
        n_invocations = 0;
        integer_variables = false;
        additive_h = false;
        lp = new IloCplex();
        lp.setOut(null);
        cond_to_cplex_cond = new HashMap();
        action_to_variable = new HashMap();
        pos_affectors_of = new HashMap();
        this.affectors_of = new HashMap();

    }

    @Override
    public void initialize(Collection<GroundAction> actions, State s_0) {
        

        //first_time.set(c.getCounter(),true);
        this.init_condition(actions, s_0);

    }

    @Override
    public void update_conditions_bound_plus_reset_variables(State s_0) {
        this.update_local_global_conditions(s_0);
        
        
        for (IloNumVar v : this.action_to_variable.values()) {
            try {
                v.setUB(0.0);
            } catch (IloException ex) {
                Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        affectors_of_temp = new HashMap();
        for (Integer i : this.affectors_of.keySet()) {
            affectors_of_temp.put(i, new LinkedHashSet());
            affectors_of_temp.get(i).addAll(this.affectors_of.get(i));
        }
        return;
    }

    @Override
    protected void update_local_global_conditions(State s_0) {

        update_condition(s_0, c);
        if (this.gc != null) {
            update_condition(s_0, gc);
        }

    }

    @Override
    public float update_cost(State s_0, ArrayList<Boolean> active_actions, ArrayList<Float> h) {

        Collection<GroundAction> affectors = this.affectors_of_temp.get(c.getCounter());
        Iterator<GroundAction> it = affectors.iterator();
        while (it.hasNext()) {
            GroundAction gr = it.next();
            if (active_actions.get(gr.counter)) {
                try {
                    IloNumVar v = this.action_to_variable.get(gr.counter);
                    v.setUB(Float.MAX_VALUE);//activate action in the LP model
                    it.remove();
                } catch (IloException ex) {
                    Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        Float precondition_contribution = Float.MAX_VALUE;
        if (this.additive_h) {
            precondition_contribution = 0f;
        }
        for (Conditions c_0 : (Collection<Conditions>) c.sons) {
            Float local_min = Float.MAX_VALUE;
            if (s_0.satisfy(c_0)) {
                if (!this.additive_h) {
                    precondition_contribution = 0f;
                    break;
                }
                local_min = 0f;
            } else {
                for (GroundAction gr : this.pos_affectors_of.get(c_0)) {
                    local_min = Math.min(h.get(gr.getPreconditions().getCounter()), local_min);
                }
            }
            if (this.additive_h) {
                precondition_contribution += local_min;
            } else {
                precondition_contribution = Math.min(precondition_contribution, local_min);
            }
        }
        if (precondition_contribution == Float.MAX_VALUE) {
            precondition_contribution = 0f;
        }
        n_invocations++;

        try {
//            lp.solveFixed();
            lp.setParam (IloCplex.IntParam.NodeAlg, IloCplex.Algorithm.Dual);
            
//            System.out.println(lp.isMIP());

            if (lp.solve()) {
//                System.out.println(lp.getObjValue());
                if (lp.getStatus() == IloCplex.Status.Optimal) {
                    return (float) lp.getObjValue() + precondition_contribution;
                }
            }
//            }else{
//                    System.out.println("DEBUG: Infeasible");
//                }
//        System.out.println(lp);
        } catch (IloException ex) {
            Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Float.MAX_VALUE;
    }

    protected void init_condition(Collection<GroundAction> pool, State s_0) {

        action_to_variable = new HashMap();
        Collection<Conditions> conditions_to_evaluate = new LinkedHashSet();
        conditions_to_evaluate.addAll(c.sons);
        if (gc != null) {
//            System.out.println("considering Global Constraints:"+gC.sons);
            conditions_to_evaluate.addAll(gc.sons);
        }
        try {
            objective = lp.linearNumExpr();
        } catch (IloException ex) {
            Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.affectors_of.put(c.getCounter(), new LinkedHashSet());

        for (Conditions cond : conditions_to_evaluate) {

            pos_affectors_of.put(cond, new LinkedHashSet());
            if (cond instanceof Comparison) {

                try {
                    Comparison comp = (Comparison) cond;

                    IloLinearNumExpr expr = lp.linearNumExpr();
                    //IloLPMatrix m = lp.LPMatrix();

//                    IloRange e = lp.range(0, 0);
                    ExtendedNormExpression left = (ExtendedNormExpression) comp.getLeft();
                    for (ExtendedAddendum ad : left.summations) {
                        if (ad.f != null) {
                            for (GroundAction gr : pool) {
//                                                        System.out.println(gr);

                                if (gr.getNumericFluentAffected().get(ad.f) != null && gr.getNumericFluentAffected().get(ad.f).equals(Boolean.TRUE)) {
                                    for (NumEffect neff : gr.getNumericEffectsAsCollection()) {
                                        if (!neff.getFluentAffected().equals(ad.f)) {
                                            continue;
                                        }
                                        //                                    System.out.println(neff);

                                        gr.setAction_cost(s_0);
                                        Float action_cost = gr.getAction_cost();
                                        if (action_cost.isNaN()) {
                                            continue;
                                        }
                                        affectors_of.get(c.getCounter()).add(gr);//add the actions to the affectors list

                                        IloNumVar action;
                                        if (action_to_variable.get(gr.counter) != null) {
                                            action = action_to_variable.get(gr.counter);
                                        } else {
                                            action = (IloNumVar) lp.numVar(0.0, 0.0, IloNumVarType.Float);
                                            action_to_variable.put(gr.counter, action);
                                            objective.addTerm(action, action_cost);
                                        }

                                        Float right = null;
                                        switch (neff.getOperator()) {
                                            case "increase":
                                                right = neff.getRight().eval(s_0).getNumber() * ad.n.getNumber();
//                                                expr = lp.sum(expr, lp.prod(right,action));
                                                expr.addTerm(action, right);
                                                break;
                                            case "decrease":
                                                right = neff.getRight().eval(s_0).getNumber() * ad.n.getNumber();
                                                //var_to_expr.get(action).add(new Constraint(condition,-right));
                                                expr.addTerm(action, -right);
//                                                System.out.println(expr.getClass());
                                                break;
                                            case "assign":
                                                continue;
                                        }
//                                    System.out.println("DEBUG:"+condition+" right:"+right);

                                    }
                                }
                                if (gr.getNumberOfExecution(s_0, comp) != Float.MAX_VALUE) {
                                    pos_affectors_of.get(comp).add(gr);
                                }
                            }
                        }
                    }

                    IloRange e = lp.addGe(expr, 0.0);
                    //lp.add(e);
                    this.cond_to_cplex_cond.put(cond, e);
                } catch (IloException ex) {
                    Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (cond instanceof Predicate) {
                try {
                    IloLinearNumExpr e = lp.linearNumExpr();
                    Predicate p = (Predicate) cond;
                    for (GroundAction gr : pool) {
                        if (gr.achieve(p)) {
                            pos_affectors_of.get(cond).add(gr);
                            affectors_of.get(c.getCounter()).add(gr);//add the actions to the affectors list
                            gr.setAction_cost(s_0);
                            Float action_cost = gr.getAction_cost();
                            if (action_cost.isNaN()) {
                                continue;
                            }
                            IloNumVar action;
                            if (action_to_variable.get(gr.counter) != null) {
                                action = action_to_variable.get(gr.counter);
                            } else {
                                action = (IloNumVar) lp.numVar(0.0, 0.0, IloNumVarType.Float);
                                action_to_variable.put(gr.counter, action);

                                objective.addTerm(action, action_cost);     
                            }
                            e.addTerm(action, 1);
//                                e = lp.sum(lp.prod(action, 1), e);
                        }
                    }

                    IloRange condition = lp.addGe(e, 1.0);
                    this.cond_to_cplex_cond.put(cond, condition);

                } catch (IloException ex) {
                    Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        try {
            
//            this.action_variables = lp.numVarArray(action_to_variable.values().size(), 0, 0);
//            for (Integer grInd: action_to_variable.keySet()){
//                action_variables[grInd]  =action_to_variable.get(grInd);
//            }
            lp.setWarning(null);
//           System.out.println(objective.getClass());
            lp.addMinimize(objective);

        } catch (IloException ex) {
            Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void update_condition(State s_0, Conditions temp) {

        for (Conditions c_0 : (Collection<Conditions>) temp.sons) {
            IloRange lp_cond = this.cond_to_cplex_cond.get(c_0);
            if (c_0 instanceof Comparison) {
                Comparison comp = (Comparison) c_0;
                PDDLNumber eval = comp.getLeft().eval(s_0);
                if (eval == null) {
                    try {
                        lp_cond.setLB(Float.MAX_VALUE);//This is a little hack. It may happen that the constraints cannot be evaluated. In 
                    } catch (IloException ex) {
                        Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Float number = eval.getNumber();
                    //                System.out.println("DEBUG: expression before:" + lp.getExpression(lp_cond.getName()));
                    try {

                        if (comp.getComparator().equals(">") || comp.getComparator().equals(">=")) {
                            lp_cond.setLB(-number);

                        } else if (comp.getComparator().equals("=")) {
                            lp_cond.setLB(number);
                            lp_cond.setUB(number);
                        } else {
                            lp_cond.setLB(number);

                        }
                    } catch (IloException ex) {
                        Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
//                System.out.println("DEBUG: expression after:" + lp.getExpression(lp_cond.getName()));

            } else if (c_0 instanceof Predicate) {
                if (s_0.satisfy(c_0)) {
                    try {
                        lp_cond.setLB(0);
                    } catch (IloException ex) {
                        Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        lp_cond.setLB(1);
                    } catch (IloException ex) {
                        Logger.getLogger(cplex_interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }

}
