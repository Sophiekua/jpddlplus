/* 
 * Copyright (C) 2010-2017 Enrico Scala. Contact: enricos83@gmail.com.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package problem;

import conditions.AndCond;
import conditions.Comparison;
import conditions.ComplexCondition;
import conditions.ConditionalEffect;
import conditions.Condition;
import conditions.NotCond;
import conditions.OrCond;
import conditions.PDDLObject;
import conditions.PostCondition;
import conditions.Predicate;
import domain.ParametersAsTerms;
import domain.ActionSchema;
import domain.PDDLGenericAction;
import domain.PddlDomain;
import domain.Variable;
import expressions.ExtendedAddendum;
import expressions.Expression;
import expressions.ExtendedNormExpression;
import expressions.NumEffect;
import expressions.NumFluent;
import expressions.PDDLNumber;
import expressions.Interval;
import extraUtils.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import plan.SimplePlan;
import heuristics.utils.RegressedSearchNode;

public class PDDLGroundAction extends PDDLGenericAction implements Comparable{

    protected ParametersAsTerms parameters_as_terms;
    public Boolean numeric_effect_undefined;
    public boolean normalized;
    private ArrayList primitives;
    private boolean isMacro;
    public int hiddenParametersNumber;
    private Float prevDistanceFromProblem;
    public Comparison achievedComparison = null;
    public PDDLGroundAction generator;
    public HashSet<Condition> achievedComparisons;
    private boolean reacheable = false;
    private HashMap<NumFluent, Float> coefficientAffected;
    private Float action_cost;
    public int id;
    public HashMap<Integer, Boolean> interact_with;
    private HashMap<Predicate, Boolean> achieve;
    private Integer int_depencies;
    public Float time = null;
    private Boolean has_state_dependent_effects;
    private LinkedHashSet<NumEffect> list_of_numeric_fluents_affected;
    public boolean dummy_goal;
    
    public boolean infinite_constant_effect = false;

    @Override
    public Object clone() throws CloneNotSupportedException {
        PDDLGroundAction ret = new PDDLGroundAction(name);
        if (this.addList != null) {
            ret.addList = (AndCond) this.addList.clone();
        }
        if (this.delList != null) {
            ret.delList = (AndCond) this.delList.clone();
        }
        ret.normalized = this.normalized;
        if (this.numericEffects != null) {
            ret.numericEffects = (AndCond) this.numericEffects.clone();
        }
        if (this.cond_effects != null) {
            ret.cond_effects = (AndCond) this.cond_effects.clone();
        }

        if (this.numericFluentAffected != null) {
            ret.numericFluentAffected = (HashMap) this.numericFluentAffected.clone();
        }
        if (this.parameters_as_terms != null) {
            ret.parameters_as_terms = (ParametersAsTerms) this.parameters_as_terms.clone();
        }
        if (this.preconditions != null) {
            ret.preconditions = (ComplexCondition) this.preconditions.clone();
        }
        if (this.interact_with != null) {
            ret.interact_with = (HashMap<Integer, Boolean>) this.interact_with.clone();
        }
        return ret;

    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        PDDLGroundAction gr = (PDDLGroundAction) obj;
        return (gr.getName().equalsIgnoreCase(this.getName())) && gr.getParameters().equals(this.getParameters());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.parameters_as_terms != null ? this.parameters_as_terms.hashCode() : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 11 * hash + (this.parameters != null ? this.parameters.hashCode() : 0);
//        return hash;
//    }
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 37 * hash + (this.parameters != null ? this.parameters.hashCode() : 0);
//        return hash;
//    }
    public PDDLGroundAction() {
        super();
        this.name = name;
        numericFluentAffected = null;
        this.parameters_as_terms = new ParametersAsTerms();
        this.preconditions = new AndCond();
        this.numericEffects = new AndCond();
        this.cond_effects = new AndCond();
        //numericFluentAffected = new HashMap();
        action_cost = null;
        interact_with = new HashMap();
        achieve = new HashMap();
    }

    public PDDLGroundAction(String name) {
        super();
        this.name = name;
        numericFluentAffected = null;
        this.parameters_as_terms = new ParametersAsTerms();
        this.preconditions = new AndCond();
        this.numericEffects = new AndCond();
        this.addList = new AndCond();
        this.delList = new AndCond();
        this.cond_effects = new AndCond();
        //numericFluentAffected = new HashMap();
        action_cost = null;
        interact_with = new HashMap();
        achieve = new HashMap();
    }

//    @Override
//    public String toString() {
//        String parametri = "";
//        for (Object o : getParameters()) {
//            parametri = parametri.concat(o.toString()).concat(" ");
//        }
//        return "\n\nAction Name:" + this.name + " Parameters: " + parametri + "\nPre: " + this.preconditions + "\nEffetti positivi: " + this.getAddList() + "\nEffetti negativi: " + this.getDelList() + "\nNumeric Effects:  " + this.getNumericEffects();
//
//    }
//    @Override
//    public String toString() {
//        String parametri = "";
//        if (getParameters() != null) {
//            for (Object o : getParameters()) {
//                parametri = parametri.concat(o.toString()).concat(" ");
//            }
//        }
//        return this.name + " " + parametri;
//
//    }
    
    
    
    
    
    public String toEcoString() {
        String parametri = "";
        if (getParameters() != null) {
            for (Object o : getParameters()) {
                parametri = parametri.concat(o.toString()).concat(" ");
            }
        }
        if (this.time == null) {
            return " " + this.name + " Parameters: " + parametri;
        } else {
            return "(" + String.format("%.5f", time) + ") " + this.name + " Parameters: " + parametri;
        }

    }

    public String toFileCompliant() {

        StringBuilder parametri = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (Object o : getParameters()) {
            PDDLObject obj = (PDDLObject) o;
            parametri = parametri.append(obj.getName().concat(" "));
        }
        if (time == null) {
            res.append("(").append(this.name).append(" ").append(parametri).append(")");
            return res.toString();
        } else {
            return String.format("%.5f", time) + ": (" + this.name + " " + parametri + ")";
        }

    }

    /**
     * @return the parameters
     */
    public ParametersAsTerms getParameters() {
        return parameters_as_terms;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(ParametersAsTerms parameters) {
        this.parameters_as_terms = parameters;
    }

    public PDDLState apply(PDDLState s) {
        
//        System.out.println(this.getClass());
//        System.out.println(s.getClass());
//        if (!this.isApplicable(ret)){
//            //System.out.println("Action: " + this + "  is not applicable");
//            return null;
//        }
        HashMap subst = new HashMap();
        AndCond del = (AndCond) delList;
        if (del != null) {
            del.apply(s, subst);
        }
        AndCond add = (AndCond) addList;
        if (add != null) {
            add.apply(s, subst);
        }

        AndCond c = (AndCond) this.getNumericEffects();
        c.apply(s, subst);

        if (this.cond_effects != null) {
            AndCond c_eff = (AndCond) this.cond_effects;
            c_eff.apply(s, subst);
        }

        for (Object o : subst.keySet()) {
            if (o instanceof NumFluent) {
                NumFluent nf = (NumFluent) o;
                if (nf.has_to_be_tracked()) {
                    s.setFunctionValue(nf, (PDDLNumber) subst.get(o));
                }
            } else {
                Boolean newval = (Boolean) subst.get(o);
                if (!newval) {
                    s.setPredFalse((Predicate) o);
                } else {
                    s.setPredTrue((Predicate) o);
//                    s.initPred.put((Predicate)o, (Boolean)subst.get(o));
                    
                }
            }
        }
//        System.out.println("DEBUG: Subst within action application:"+subst);
        return s;
    }

    public Collection<NumEffect> getNumericEffectsAsCollection() {
        if (this.list_of_numeric_fluents_affected == null) {
            AndCond num = (AndCond) this.getNumericEffects();
            list_of_numeric_fluents_affected = new LinkedHashSet();
            this.numericFluentAffected = new HashMap();
            if (num != null) {
                for (Object o : num.sons) {
                    if (o instanceof NumEffect) {
                        NumEffect e = (NumEffect) o;
                        this.numericFluentAffected.put(e.getFluentAffected(), Boolean.TRUE);
                        list_of_numeric_fluents_affected.add(e);
                    }
                }
            }
        }
        return list_of_numeric_fluents_affected;
    }

    public void normalize() throws Exception {

        if (normalized) {
            return;
        }

        if (this.getPreconditions() != null) {
            this.getPreconditions().normalize();
            if (this.getPreconditions().isUnsatisfiable()) {
                this.setReacheable(true);
            }
        }

        AndCond num = (AndCond) this.getNumericEffects();
        if (num != null) {
            for (Object o : num.sons) {
                if (o instanceof NumEffect) {
                    NumEffect e = (NumEffect) o;
                    //System.out.println(e);
                    e.setRight(e.getRight().normalize());
                }
            }
        }
        this.normalized = true;
    }

    /**
     * @param numericFluentAffected the numericFluentAffected to set
     */
    public void setNumericFluentAffected(HashMap<NumFluent, Boolean> numericFluentAffected) {
        this.numericFluentAffected = numericFluentAffected;
    }

    public RelState apply(RelState s) {

        HashMap subst = new HashMap();
        AndCond del = (AndCond) delList;
        if (del != null) {
            del.apply(s, subst);
        }
        AndCond add = (AndCond) addList;
        if (add != null) {
            add.apply(s, subst);
        }

        AndCond c = (AndCond) this.getNumericEffects();
        c.apply(s, subst);

        if (this.cond_effects != null) {
            AndCond c_eff = (AndCond) this.cond_effects;
            c_eff.apply(s, subst);
        }

        s.update_values(subst);

        return s;

    }

    public boolean isApplicable(RelState current) {

        if (numericEffectUndefined(current)) {
            return false;
        }

        if (this.getPreconditions() == null) {
            return true;
        }

        return this.getPreconditions().can_be_true(current);
    }

    public boolean isApplicable(PDDLState s) {
        PDDLState current = (PDDLState)s;
        if (this.getPreconditions() == null) {
            return true;
        }
        return this.getPreconditions().isSatisfied(current);
    }

    public PDDLGroundAction buildMacroInProgression(PDDLGroundAction b, PddlDomain pd) throws CloneNotSupportedException, Exception {
        if (this.name == null) {
            return (PDDLGroundAction) b.clone();
        }
        PDDLGroundAction a = this;

        PDDLGroundAction ab = new PDDLGroundAction(a.name + "_" + b.name);
        if (a.getPrimitives().isEmpty()) {
            a.getPrimitives().add(a);
        }
        ab.setPrimitives((ArrayList) a.getPrimitives().clone());
        if (b.isMacro) {
            ab.getPrimitives().addAll(b.getPrimitives());
        }

        ab.getPrimitives().add(b);
        if (a.getParameters() != null) {
            ab.setParameters((ParametersAsTerms) a.getParameters().clone());
        }
        if (b.getParameters() != null) {
            ab.getParameters().addALLNewObjects(b.getParameters());
        }

        ab.setPreconditions((ComplexCondition) regress(b, a));
        progress(a, b, ab);
        ab.setIsMacro(true);
        //System.out.println("Da dentro l'azione..."+ab);
        //ab.simplifyModel(pd, pp);
        //ab.computeDistance(pd,pp,consideringNumericInformationInDistance);
        return ab;
    }

    public PDDLGroundAction buildMacroInProgression(PDDLGroundAction b, PddlDomain pd, PddlProblem pp, boolean consideringNumericInformationInDistance) throws CloneNotSupportedException, Exception {
        if (this.name == null) {

            return (PDDLGroundAction) b.clone();
        }
        PDDLGroundAction a = this;

        PDDLGroundAction ab = new PDDLGroundAction(a.name + "_" + b.name);
        if (a.getPrimitives().isEmpty()) {
            a.getPrimitives().add(a);
        }
        ab.setPrimitives((ArrayList) a.getPrimitives().clone());
        if (b.isMacro) {
            ab.getPrimitives().addAll(b.getPrimitives());
        }

        ab.getPrimitives().add(b);

        ab.setParameters((ParametersAsTerms) a.getParameters().clone());
        ab.getParameters().addALLNewObjects(b.getParameters());

        //System.out.println(b.pddlEffects());
        //      System.out.println(a.pddlEffects());
        ab.setPreconditions((ComplexCondition) regress(b, a));
        progress(a, b, ab);
        ab.setIsMacro(true);
//        System.out.println("Da dentro l'azione..."+ab);
        ab.simplifyModel(pd, pp);
        ab.computeDistance(pd, pp, consideringNumericInformationInDistance);

        if (ab.getName() == null) {
            System.out.println(a + " " + b + " created a null action");
        }

        return ab;
    }

    public Condition regress(PDDLGroundAction b, PDDLGroundAction a) {

        /*Propositional Part first*/
        AndCond result = (AndCond) b.getPreconditions().clone();

        /*probably something more efficient can be done here*/
        for (Object o1 : a.getAddList().sons) {
            result.sons.remove(o1);
        }
        for (Object o1 : result.sons) {

            //Numeric part. Substitution of variables
            if (o1 instanceof Comparison) {
                Comparison c = (Comparison) o1;
                c.setLeft(c.getLeft().subst(a.getNumericEffects()));
                c.setRight(c.getRight().subst(a.getNumericEffects()));
            } else if (a.getDelList() != null) {
                if (a.getDelList().sons.contains(o1)) {
                    System.out.println("Error, " + a.name + " cannot be followed by " + b.name);
                    return null;
                }
            }

        }

        result.sons.addAll(a.getPreconditions().sons);

        //AndCond numericCondition = 
        return result;
    }

    public Comparison regressComparison(Comparison cond) {

        Comparison c = (Comparison) cond;
        c.setNormalized(false);
        c.setLeft(c.getLeft().subst(this.getNumericEffects()));
        c.setRight(c.getRight().subst(this.getNumericEffects()));
        return c;
    }

    public Condition regress(Condition cond) {

        if (cond instanceof Comparison) {
            Comparison c = (Comparison) cond;
            c.setLeft(c.getLeft().subst(this.getNumericEffects()));
            c.setRight(c.getRight().subst(this.getNumericEffects()));
            return c;//this is an error!!!
        }

        /*Propositional Part first*/
        AndCond result = (AndCond) cond;


        /*probably something more efficient can be done here*/
        if (this.getAddList() != null) {
            for (Object o1 : this.getAddList().sons) {
                result.sons.remove(o1);
            }
        }
        for (Object o1 : result.sons) {

            //Numeric part. Substitution of variables
            if (o1 instanceof Comparison) {
                Comparison c = (Comparison) o1;
                c.setLeft(c.getLeft().subst(this.getNumericEffects()));
                c.setRight(c.getRight().subst(this.getNumericEffects()));

            } else if (this.getDelList() != null) {
                if (this.getDelList().sons.contains(o1)) {
                    System.out.println("Error, " + this.name + " cannot achieve " + cond.toString());
                    return null;
                }
            }

        }

        if (this.getPreconditions() != null) {
            result.sons.addAll(this.getPreconditions().sons);
        }

        //AndCond numericCondition = 
        return result;
    }

    public Condition regress_formula(Condition input) {
        AndCond ret = new AndCond();
        Condition con = input.regress(this);
        if (con instanceof AndCond) {
            ret.sons.addAll(((AndCond) con).sons);
        } else {
            ret.addConditions(con);
        }
        return ret;
    }

    public Condition regress_formula_old(Condition input) {
        AndCond ret = new AndCond();
        if (this.getPreconditions() != null && !this.getPreconditions().sons.isEmpty()) {
            ret.addConditions(this.getPreconditions());
        }
        Condition con = input.regress(this);
        if (con instanceof AndCond) {
            ret.sons.addAll(((AndCond) con).sons);
        } else {
            ret.addConditions(con);
        }
        return ret;
    }

    private void progress(PDDLGroundAction a, PDDLGroundAction b, PDDLGroundAction ab) {

        /*Starting from what action a achieve*/
        AndCond localAddList = (AndCond) a.addList.clone();

        /*remove those atoms which will be deleted afterwards*/
        localAddList.subtractElements((AndCond) b.getDelList());

        /*atoms achieved by b*/
        //System.out.println(b);
        //System.out.println(b.getAddList());
        if (b.getAddList() != null) {
            localAddList.sons.addAll(b.getAddList().sons);
        }

        /*Starting from what action a deletes*/
        AndCond localDelList = null;
        if (a.delList != null) {
            localDelList = (AndCond) a.delList.clone();
            /*remove those atoms which will be added by b*/
            localDelList.subtractNegation((AndCond) b.getAddList());
        } else {
            localDelList = new AndCond();
        }

        /*add the remaining atoms to be removed because of b*/
        if (b.getDelList() != null) {
            localDelList.sons.addAll(b.getDelList().sons);
        }


        /*update the macro operator model*/
        ab.setAddList(localAddList);
        ab.setDelList(localDelList);

        AndCond numEff = new AndCond();
        if (b.getNumericEffects() != null) {
            for (Object o : b.getNumericEffects().sons) {
                NumEffect nf = (NumEffect) o;
                numEff.sons.add(nf.subst(a.getNumericEffects()));
                ab.addNumericFluentAffected(nf.getFluentAffected());
            }
        }
        if (a.getNumericEffects() != null) {
            for (Object o : a.getNumericEffects().sons) {
                NumEffect nf = (NumEffect) o;
                //nf.getFluentAffected();
                if (ab.getNumericFluentAffected().get(nf.getFluentAffected()) == null) {
                    numEff.sons.add(o);
                    ab.addNumericFluentAffected(nf.getFluentAffected());
                }
            }
        }

        ab.setNumericEffects(numEff);

    }

    public String toPDDL() {

        String ret = "(:action " + this.name + "\n";

        ret += ":parameters ()\n";
        ret += ":precondition " + this.getPreconditions().pddlPrint(false) + "\n";
        ret += ":effect " + this.pddlEffects();

        return ret + ")";

    }
//    
//    (:action debark
// :parameters (?p - person ?a - aircraft ?c - city)
// :precondition (and (in ?p ?a)
//                 (located ?a ?c))
// :effect (and (not (in ?p ?a))
//              (located ?p ?c)
//		(decrease (onboard ?a) 1)))

    protected String pddlEffects() {
        String ret = "(and ";
        if (this.getAddList() != null && this.getAddList().sons != null) {

            for (Object o : this.getAddList().sons) {
                Predicate p = (Predicate) o;
                ret += p.pddlPrint(true);
            }
        }
        if (this.getDelList() != null && this.getDelList().sons != null) {
            for (Object o : this.getDelList().sons) {
                NotCond p = (NotCond) o;
                ret += p.pddlPrint(true);
            }
        }
        if (this.getNumericEffects() != null && this.getNumericEffects().sons != null) {
            for (Object o : this.getNumericEffects().sons) {
                NumEffect nE = (NumEffect) o;
                ret += nE.pddlPrint(true);
            }
        }
        if (this.cond_effects != null) {
            for (Object o : this.cond_effects.sons) {
                ConditionalEffect nE = (ConditionalEffect) o;
                ret += nE.pddlPrint(true);

            }
        }

        return ret + ")";
    }

    public boolean simplifyModel(PddlDomain domain, PddlProblem problem) throws Exception {

        HashMap invariantFluents = problem.getActualFluents();
        //add invariantFluents because free variable
        for (NumFluent nf : (Collection<NumFluent>) domain.get_derived_variables()) {
            invariantFluents.put(nf.getName(), Boolean.FALSE);
        }

        PDDLGroundAction a = this;

        Condition con = a.getPreconditions();

        if (con != null) {

            con = con.weakEval(problem.getInit(), invariantFluents);

            if (con == null) {
                //System.out.println("A precondition is never satisfiable");
                return false;
            }
        }

        Condition eff = a.getNumericEffects();

        //System.out.println(abstractInvariantFluents);
        eff = eff.weakEval(problem.getInit(), invariantFluents);

        if (eff == null) {
            return false;
        }
        //System.out.println(a.toPDDL());
        a.normalize();
//        if (a.isUnsatisfiable())
//            return false;
        //System.out.println(a.toPDDL());
        return true;
    }

    public void setPrimitives(ArrayList primitives) {
        setIsMacro(true);
        this.primitives = primitives;
    }

    /**
     * @return the isMacro
     */
    public boolean isIsMacro() {
        return isMacro;
    }

    /**
     * @param isMacro the isMacro to set
     */
    public void setIsMacro(boolean isMacro) {
        this.isMacro = isMacro;
    }

    /**
     * @return the primitives
     */
    public ArrayList getPrimitives() {
        if (primitives == null) {
            primitives = new ArrayList();
        }
        return primitives;
    }

    public Float computeDistance(PddlProblem prob) {
        int missingGoals = 0;
        int destroyingGoals = 0;
        int missingPreconditions = 0;
        int cumulativeComparisonDistance = 0;
        AndCond prec = new AndCond();
        float dist = 0;//this.getPrimitives().size()/2;
        if (this.preconditions instanceof AndCond) {
            prec = (AndCond) this.preconditions;
        } else {
            System.out.println(this.preconditions.getClass() + " is not supported");
        }

        for (Object o : prec.sons) {
            if (o instanceof Predicate) {
                Predicate p = (Predicate) o;
                if (!p.isSatisfied(prob.getInit())) {
                    missingPreconditions++;
                }
            } else if (o instanceof Comparison) {
                Comparison comp = (Comparison) o;
                cumulativeComparisonDistance += (Math.max(comp.satisfactionDistance(prob.getInit()), 0));
            }
        }
        AndCond goal = new AndCond();
        if (prob.getGoals() instanceof AndCond) {
            goal = (AndCond) prob.getGoals();
        } else {
            System.out.println(prob.getGoals().getClass() + " is not supported");
        }

        for (Object o : goal.sons) {
            if (o instanceof Predicate) {
                Predicate p = (Predicate) o;
                if (this.addList instanceof AndCond) {
                    if (!this.addList.sons.contains(o)) {
                        missingGoals++;
                    }
                }
            } else if (o instanceof Comparison) {

                //System.out.println("distanza da comparison del goal da fare!");
            }
        }
        if (delList instanceof AndCond) {
            for (NotCond o : (HashSet<NotCond>) delList.sons) {
                //System.out.println(o);
                if (goal.sons.contains(o.getSon())) {
                    //System.out.println(o);
                    destroyingGoals++;
                }
            }
        }

        float malus = 0;
        //System.out.println("Primitives:" + this.primitives.size());
//        float rA = (float) this.computeReputedActions();
//        //System.out.println(rA);
//        if (rA / (float) this.primitives.size() < 0.1) {
//            malus = 100*(float) this.primitives.size()/rA;
//        }

        dist = (float) (missingGoals + destroyingGoals + missingPreconditions);

        float a = 0;// 1-this.getParametersFusionNumber()/(float)this.hiddenParametersNumber;

        //System.out.println("Missing Goal!!:" +missingGoals +" Normalizzato" + (float)(prob.getGoals().sons.size()-missingGoals)/(float)prob.getGoals().sons.size());
        this.setPrevDistanceFromProblem((Float) dist + a);
        //this.prevDistanceFromProblem = dist;

        return getPrevDistanceFromProblem();
    }

    public int getParametersFusionNumber() {
        hiddenParametersNumber = 0;
        if (this.isMacro) {

            for (PDDLGroundAction gr : (ArrayList<PDDLGroundAction>) this.primitives) {
                hiddenParametersNumber += gr.getParameters().size();

            }
        }
        return hiddenParametersNumber - this.getParameters().size();
    }

    public PDDLGroundAction buildMacroInRegression(PDDLGroundAction a, PddlDomain pd, PddlProblem pp, boolean consideringNumericInformationInDistance) throws CloneNotSupportedException, Exception {
        if (this.name == null) {
            return (PDDLGroundAction) a.clone();
        }
        PDDLGroundAction b = (PDDLGroundAction) this;

        PDDLGroundAction ba = new PDDLGroundAction(a.name + "_" + b.name);
        if (b.getPrimitives().isEmpty()) {
            b.getPrimitives().add(b);
        }
        ba.setPrimitives((ArrayList) b.getPrimitives().clone());
        ba.getPrimitives().add(0, a);

        ba.setParameters((ParametersAsTerms) b.getParameters().clone());
        ba.getParameters().addALLNewObjects(a.getParameters());

        ba.setPreconditions((ComplexCondition) regress(b, a));
        progress(a, b, ba);
        ba.setIsMacro(true);
        ba.simplifyModel(pd, pp);
        ba.computeDistance(pd, pp, consideringNumericInformationInDistance);

        return ba;
    }

    public Float getDistance() {
        return getPrevDistanceFromProblem();
    }

    @Override
    public int compareTo(Object t) {
        PDDLGroundAction gr = (PDDLGroundAction) t;
        if (this.getPrevDistanceFromProblem().equals(gr.getPrevDistanceFromProblem())) {
            return -1;
        }

        return this.getPrevDistanceFromProblem().compareTo(gr.getPrevDistanceFromProblem());
    }

    private int computeReputedActions() {

        HashSet counter = new HashSet();
        for (Object o : this.primitives) {
            PDDLGroundAction a = (PDDLGroundAction) o;
            counter.add(a.getName());
        }
        //System.out.println(ret);
        return counter.size();
    }

    /**
     * @return the prevDistanceFromProblem
     */
    public Float getPrevDistanceFromProblem() {
        return prevDistanceFromProblem;
    }

    /**
     * @param prevDistanceFromProblem the prevDistanceFromProblem to set
     */
    public void setPrevDistanceFromProblem(Float prevDistanceFromProblem) {
        this.prevDistanceFromProblem = prevDistanceFromProblem;
    }

    public boolean threatenConditions(ComplexCondition goal, SimplePlan sp, PDDLState current) {
        boolean threatened = false;
        for (Object o : goal.sons) {
            if (o instanceof Predicate) {
                Predicate p = (Predicate) o;
                if (this.addList instanceof AndCond) {
                    if (!this.addList.sons.contains(o)) {
                        threatened = true;
                    }
                }
            } else if (o instanceof Comparison) {
                System.out.println("Minacce su goal comparison da fare!");
            }
        }

        return threatened;

    }

    public boolean threatGoalConditions(ComplexCondition goal, SimplePlan sp, int j, PDDLState current) throws CloneNotSupportedException {
        boolean threatened = false;

        Set threatenedAtoms = new HashSet();

         if (delList instanceof AndCond) {
            for (NotCond o : (HashSet<NotCond>) delList.sons) {
                //System.out.println(o);
                for (Object o1 : goal.sons) {
                    //System.out.println(o1);
                    //System.out.println(o.son.iterator().next());
                    Predicate a = (Predicate) o.getSon();
                    Predicate b = (Predicate) o1;
                    if (a.toString().equalsIgnoreCase(b.toString())) {
                        //System.out.println("Scoperto!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!<=======================================");
                        //System.out.println("Per azione:" + j);
                        threatenedAtoms.add(o1);
                    }
                }
            }
        }
        if (threatenedAtoms.isEmpty()) {
            return false;
        }
        PDDLState end = current.clone();
        for (int i = j; i < sp.size(); i++) {
            end = (PDDLState) sp.get(i).apply(end);
        }
        for (Object o : threatenedAtoms) {
            if (!end.holds((Predicate) o)) {
                System.out.println("=================Found a goal threat=============");
                return true;
            }

        }

        return false;
    }

    private float computeDistance(PddlDomain pd, PddlProblem prob, boolean consideringNumericInformationInDistance) throws Exception {
        int missingGoals = 0;
        int destroyingGoals = 0;
        int missingPreconditions = 0;
        int cumulativeComparisonDistance = 0;
        AndCond prec = new AndCond();

        //NumericPlanningGraph gr = new NumericPlanningGraph();
        //prob.generateActions();
        //System.out.println("Propositional Time:"+pp.getPropositionalTime());
        //RelState rel_state = gr.computeStateBound(prob.getInit(),prob.getGoals(),prob.getActions());
        float dist = 0;//this.getPrimitives().size()/2;
         if (this.preconditions instanceof AndCond) {
            prec = (AndCond) this.preconditions;
        } else {
            System.out.println(this.preconditions.getClass() + " is not supported");
        }

        for (Object o : prec.sons) {
            if (o instanceof Predicate) {
                Predicate p = (Predicate) o;
                if (!p.isSatisfied(prob.getInit())) {
                    missingPreconditions++;
                }
            }
        }
        cumulativeComparisonDistance += prob.getInit().normalizedDist(prec, prob.getPossStates(), "sum");
        AndCond goal = new AndCond();
        if (prob.getGoals() instanceof AndCond) {
            goal = (AndCond) prob.getGoals();
        } else {
            System.out.println(prob.getGoals().getClass() + " is not supported");
        }

        for (Object o : goal.sons) {
            if (o instanceof Predicate) {
                Predicate p = (Predicate) o;
                if (this.addList instanceof AndCond) {
                    if (!this.addList.sons.contains(o)) {
                        missingGoals++;
                    }
                }
            } else if (o instanceof Comparison) {
                //System.out.println("distanza da comparison del goal da fare!");
            }
        }
        if (delList instanceof AndCond) {
            for (NotCond o : (HashSet<NotCond>) delList.sons) {
                //System.out.println(o);
                if (goal.sons.contains(o.getSon())) {
                    //System.out.println(o);
                    destroyingGoals++;
                }
            }
        }

        float malus = 0;
        //System.out.println("Primitives:" + this.primitives.size());
//        float rA = (float) this.computeReputedActions();
//        //System.out.println(rA);
//        if (rA / (float) this.primitives.size() < 0.1) {
//            malus = 100*(float) this.primitives.size()/rA;
//        }

        if (!consideringNumericInformationInDistance) {
            cumulativeComparisonDistance = 0;
        }
        dist = (float) (missingGoals + destroyingGoals + missingPreconditions + cumulativeComparisonDistance);

        float a = 0;// 1-this.getParametersFusionNumber()/(float)this.hiddenParametersNumber;

        //System.out.println("Missing Goal!!:" +missingGoals +" Normalizzato" + (float)(prob.getGoals().sons.size()-missingGoals)/(float)prob.getGoals().sons.size());
        this.setPrevDistanceFromProblem((Float) dist + a);
        //this.prevDistanceFromProblem = dist;

        return getPrevDistanceFromProblem();
    }

    public Condition regressAndStoreFatherPointer(ComplexCondition cond) {
        /*Propositional Part first*/

        AndCond result = new AndCond();


        /*probably something more efficient can be done here*/
        if (this.getAddList() != null) {
            for (Object o1 : cond.sons) {
                if (o1 instanceof Predicate) {
                    if (!this.getAddList().sons.contains(o1)) {
                        result.sons.add(o1);
                    }
                }
            }

        }
        for (Object o1 : cond.sons) {

            //Numeric part. Substitution of variables
            if (o1 instanceof Comparison) {
                Comparison temp = (Comparison) o1;
                Comparison c = (Comparison) temp.clone();
                c.setLeft(c.getLeft().subst(this.getNumericEffects()));
                c.setRight(c.getRight().subst(this.getNumericEffects()));
                c.fatherFromRegression = temp;
                result.sons.add(c);
            } else if (this.getDelList() != null) {
                if (this.getDelList().sons.contains(o1)) {
                    System.out.println("Error, " + this.name + " cannot achieve " + cond.toString());
                    return null;
                }
            }

        }

        result.sons.addAll(this.getPreconditions().sons);

        //AndCond numericCondition = 
        return result;
    }

    public ActionSchema unGround() {
        ActionSchema result = new ActionSchema();
        result.setName(this.name);

        Map asbstractionOf = this.abstractParameters();
        for (Object o : this.getParameters()) {
            PDDLObject obj = (PDDLObject) o;
            result.addParameter((Variable) asbstractionOf.get(obj.getName()));
        }
        //System.out.println("Macro Action: " + result.getName());
        //System.out.println(asbstractionOf);
        result.setPreconditions((ComplexCondition) preconditions.unGround(asbstractionOf));
        result.setAddList((AndCond) addList.unGround(asbstractionOf));
        result.setDelList((AndCond) delList.unGround(asbstractionOf));
        result.setNumericEffects((AndCond) this.numericEffects.unGround(asbstractionOf));

        return result;
    }

    private Map abstractParameters() {

        HashMap result = new HashMap();
        for (Object o : this.getParameters()) {
            PDDLObject po = (PDDLObject) o;
            Variable absPo = new Variable();
            absPo.setName("?" + po.getName());
            absPo.setType(po.getType());
            result.put(po.getName(), absPo);
        }
        return result;
    }

    public boolean achieve(Predicate p) {

        if (this.achieve.get(p) == null) {
            if (this.getAddList() != null) {
                if (this.getAddList().getInvolvedPredicates().contains(p)){
                    this.achieve.put(p, true);
                    return true;
                }
            }
            this.achieve.put(p, false);
            return false;
        }

        return this.achieve.get(p);
    }

    public boolean delete(Predicate p) {
        AndCond add = (AndCond) this.getDelList();
        //System.out.println(this.toPDDL());
        //System.out.println(this.getDelList());
        if (add == null) {
            return false;
        }
        if (add.sons == null) {
            return false;
        }
        for (Object o : this.getDelList().sons) {
            NotCond nc = (NotCond) o;
            //System.out.println(nc);

            if (nc.getSon().equals(p)) {
                return true;
            }
        }
        return false;
    }

    public PDDLState transformInState() {
        PDDLState ret = new PDDLState();
        ret = (PDDLState) this.apply(ret);
        return ret;
    }

    public boolean mayInfluence(Comparison aThis) {

        this.generateAffectedNumFluents();
        if (aThis.isNormalized()) {
            return aThis.getLeft().involve(numericFluentAffected) || aThis.getRight().involve(this.numericFluentAffected);
        } else {
            return aThis.getLeft().involve(this.numericFluentAffected) || aThis.getRight().involve(this.numericFluentAffected);
        }

    }

    @Deprecated
    public Pair<Boolean, Integer> improve_k_old(PDDLState s_0, Comparison c, int k, HashMap<PDDLGroundAction, HashSet<PDDLGroundAction>> influence_graph, HashMap<PDDLGroundAction, Boolean> visited) throws Exception {
        Pair<Boolean, Integer> ret = new Pair(Boolean.FALSE, 0);
        int res = this.improve_new(s_0, c);
        if (res == 1) {
            ret.setFirst(Boolean.TRUE);
            return ret;
        }
        if (res == -1) {//when it does not influence
            return ret;
        }
        if (!this.effects_might_be_influenced()) {//when it cannot be influenced (the right side is a number)
            return ret;
        }

        //System.out.println("gr:"+this.pddlEffects());
        if (k == 0) {
            ret.setSecond(1);
            return ret;
        }
        if (visited == null) {
            visited = new HashMap();
        }
        visited.put(this, Boolean.TRUE);
        //System.out.println(this);
        for (PDDLGroundAction gr : influence_graph.get(this)) {
            if (visited.get(gr) != null) {
                continue;
            }
            Pair<Boolean, Integer> temp = gr.improve_k(s_0, this.regressComparison((Comparison) c.clone()), k - 1, influence_graph, visited);
            if (temp.getFirst()) {
                ret.setFirst(Boolean.TRUE);
                return ret;
            } else if (temp.getSecond() > 0) {
                ret.setSecond(temp.getSecond() + 1);
            }

        }
        return ret;

    }

    public Pair<Boolean, Integer> improve_k(PDDLState s_0, Comparison c, int k, HashMap<PDDLGroundAction, HashSet<PDDLGroundAction>> influence_graph, HashMap<PDDLGroundAction, Boolean> visited) throws Exception {
        Pair<Boolean, Integer> ret = new Pair(Boolean.FALSE, 0);
        ret.setSecond(0);
        int res = this.improve_new(s_0, c);
        if (res == 1) {
            ret.setFirst(Boolean.TRUE);
            return ret;
        }
        if (res == -1) {//when it does not influence
            return ret;
        }
//        if (!this.effects_might_be_influenced()) {//when it cannot be influenced (the right side is a number)
//            return ret;
//        }

        if (res == 2) {
            //check for invariant to be put;
            //System.out.println("To Undefined State");
            ret.setSecond(1);
            return ret;
        }

        //System.out.println("gr:"+this.pddlEffects());
        if (k == 0) {
            ret.setSecond(1);
            return ret;
        }

        visited = new HashMap();

        //System.out.println(this);
        Queue<RegressedSearchNode> q = new ArrayDeque();

        q.add(new RegressedSearchNode(this, 0));

        Comparison current = (Comparison) c.clone();
        while (!q.isEmpty()) {
            RegressedSearchNode node = q.poll();
            if (node.action_cost_to_get_here >= k) {
                ret.setSecond(node.action_cost_to_get_here);
                //System.out.println("limit reached:"+node.action_cost_to_get_here);
                return ret;
            }
            if (visited.get(node.action) == null) {
                visited.put(node.action, Boolean.TRUE);
                if (!this.equals(node.action)) {
                    if (node.action.improve_new(s_0, current) == 1) {
                        ret.setSecond(node.action_cost_to_get_here);
                        //System.out.println("Indirect influence found at cost:"+node.action_cost_to_get_here);
                        return ret;
                    }
                }
                current = node.action.regressComparison((Comparison) current);
                //System.out.println(node.action);
                if (influence_graph.get(node.action) != null) {
                    for (PDDLGroundAction gr : influence_graph.get(node.action)) {
                        q.add(new RegressedSearchNode(gr, node.action_cost_to_get_here + 1));
                    }
                }
            }
        }
        return ret;

    }

    public boolean influence(HashMap<NumFluent, HashSet<NumFluent>> dependsOn) {

        for (NumFluent nf : dependsOn.keySet()) {
//            if (numericFluentAffected.contains(nf)) {
//                    return true;
//                }
            for (NumFluent nf1 : dependsOn.get(nf)) {
                if (numericFluentAffected.get(nf1) != null) {
                    //System.out.println(nf+" <-"+nf1);
                    return true;
                }
            }
        }

        return false;

    }

    public boolean influence(NumFluent nf) {
        if (this.numericFluentAffected == null) {
            this.generateAffectedNumFluents();
        }

        return numericFluentAffected.get(nf) != null;
    }

    public Set influencedBy(NumFluent nf) {
        HashSet<NumFluent> ret = new HashSet();
        AndCond c = this.getNumericEffects();
        if (c != null) {
            if (c instanceof AndCond) {
                for (Object o : c.sons) {
                    NumEffect eff = (NumEffect) o;
                    if (eff.getFluentAffected().equals(nf)) {
                        return eff.getRight().rhsFluents();
                    }

                }
            }

        }
        return null;
    }

    public PDDLState partialApply(PDDLState s, HashSet<NumFluent> toTest) {

        PDDLState ret = new PDDLState();

        for (Object o : toTest) {
            NumFluent f = (NumFluent) o;
            ret.setFunctionValue(f, f.eval(s));
            //System.out.println(s.printFluentByName("in-at"));
        }

        AndCond c = (AndCond) this.getNumericEffects();
        if (c != null) {
            ArrayList temporaryMod = new ArrayList();
            HashMap fun2numb = new HashMap();
            for (Object o : c.sons) {
                NumEffect all = (NumEffect) o;
                NumFluent f = all.getFluentAffected();
                PDDLNumber newN = null;

                Float rValue;
                if (all.getRight().eval(s) == null) {
                    newN = null;
                } else {
                    rValue = all.getRight().eval(s).getNumber();
                    //System.out.println("Rvalue!!:" + rValue);
                    if (all.getOperator().equals("increase")) {
                        if (s.functionValue(f) == null) {
                            newN = null;
                        } else {
                            newN = new PDDLNumber(s.functionValue(f).getNumber() + rValue);
                        }
                    } else if (all.getOperator().equals("decrease")) {
                        //                    System.out.print("Valore di " + f);
                        //                    System.out.println(" :"+ s.functionValue(f).getNumber());
                        if (s.functionValue(f) == null) {
                            newN = null;
                        } else {
                            newN = new PDDLNumber(s.functionValue(f).getNumber() - rValue);
                        }
                    } else if (all.getOperator().equals("assign")) {
                        //System.out.println("================ASSIGN===========");
                        newN = new PDDLNumber(rValue);
                    }
                }
                temporaryMod.add(f);
                fun2numb.put(f, newN);
            }

            for (Object o : temporaryMod) {
                NumFluent f = (NumFluent) o;
                PDDLNumber n = (PDDLNumber) fun2numb.get(f);

                ret.setFunctionValue(f, n);
                //System.out.println(s.printFluentByName("in-at"));
            }

        }
        return ret;

    }

//    public String to_smtlib_with_repetition() {
//        String parametri = "";
//        for (Object o : getParameters()) {
//            parametri = parametri.concat(o.toString()).concat("");
//        }
//        return ("ACTION" + this.name + "" + parametri).replaceAll("\\s+", "");
//    }
    public boolean threat(AndCond andCond) {
        if (this.delList == null) {
            return false;
        }
        if (this.delList.sons == null) {
            return false;
        }
        if (andCond.sons != null) {

            for (Object o : this.delList.sons) {
                NotCond nc = (NotCond) o;
                Predicate p = (Predicate) nc.getSon();
                for (Object o2 : andCond.sons) {
                    if (o2 instanceof Predicate) {
                        Predicate p1 = (Predicate) o2;
                        if (p1.equals(p)) {
                            //System.out.println("Found: "+p1+p);
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }

//    public HashMap threats(AndCond andCond) {
//        if (this.delList == null) {
//            return false;
//        }
//        if (this.delList.sons == null) {
//            return false;
//        }
//        if (andCond.sons != null) {
//
//            for (Object o : this.delList.sons) {
//                NotCond nc = (NotCond) o;
//                Predicate p = (Predicate) nc.son.iterator().next();
//                for (Object o2 : andCond.sons) {
//                    if (o2 instanceof Predicate) {
//                        Predicate p1 = (Predicate) o2;
//                        if (p1.equals(p)) {
//                            //System.out.println("Found: "+p1+p);
//                            return true;
//                        }
//                    }
//
//                }
//            }
//        }
//        return false;
//    }
//    
    public String toSmtVariableString(int i) {
        String parametri = "";
        for (Object o : getParameters()) {
            PDDLObject po = (PDDLObject) o;
            parametri += "@" + po.getName();
            //parametri = parametri.concat(po.getName()).concat("_");
        }
        return ("ACTION" + this.name + parametri + "@-" + i).replaceAll("\\s+", "");
    }

    public String toVariableString() {
        String parametri = "";
        for (Object o : getParameters()) {
            PDDLObject po = (PDDLObject) o;
            parametri += "@" + po.getName();
            //parametri = parametri.concat(po.getName()).concat("_");
        }
        return ("ACTION" + this.name + parametri + "@").replaceAll("\\s+", "");
    }

    //This function regresses the cond passed as input according to the model of the action. The value of the parameter will be modified. So if you want to generate a new condition please clone before using the function
    public Condition regressNew(Condition cond) {

        AndCond result = null;

        /*Propositional Part first*/
        if (cond instanceof AndCond) {
            result = (AndCond) cond;
        } else {
            result = new AndCond();
            result.addConditions(cond);
        }


        /*probably something more efficient can be done here*/
        if (this.getAddList() != null) {
            for (Object o1 : this.getAddList().sons) {
                //System.out.println(result);
                result.sons.remove(o1);
                //System.out.println(result);
            }

        }
        for (Object o1 : result.sons) {

            //Numeric part. Substitution of variables
            if (o1 instanceof Comparison) {
                Comparison c = (Comparison) o1;
                c.setLeft(c.getLeft().subst(this.getNumericEffects()));
                c.setRight(c.getRight().subst(this.getNumericEffects()));

            } else if (this.getDelList() != null) {
                if (this.getDelList().sons.contains(o1)) {
                    System.out.println("Error, " + this.name + " cannot achieve " + cond.toString());
                    return null;
                }
            }

        }

        //System.out.println(result);
        if (this.getPreconditions() != null) {
            result.sons.addAll(this.getPreconditions().sons);
        }

        //System.out.println(result);
        //AndCond numericCondition = 
        return result;

    }

    public boolean improve(Comparison t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean improve(PDDLState init, Comparison t1) throws Exception {
        if (!this.mayInfluence(t1)) {
            //System.out.println("Does not influence...");
            return false;
        }

        //System.out.println("Trying with:"+this);
        this.normalize();
        Float currentD = init.distance2(t1);
        if (currentD.isNaN()) {
            //System.out.println("The value of the current distance is not defined");
            currentD = -Float.MIN_VALUE;
        }
        Comparison regr = this.regressComparison((Comparison) t1.clone());
        regr.normalize();
//        System.out.println("Constraint:"+t1);
//        System.out.println("Regressed Constraint:"+regr);
        Float newDist = init.distance2(regr);
//        System.out.println("newDist:"+newDist);
//        System.out.println("prevDist:"+currentD);
        if (newDist > currentD) {

            return true;
        }
        return false;
    }

    public int improve_new(PDDLState init, Comparison t1) throws Exception {
        if (!this.mayInfluence(t1)) {
            //System.out.println("Does not influence...");
            return -1;
        }

//        System.out.println("Trying with:"+this);
        this.normalize();
        Float currentD = init.distance2(t1);

        Comparison regr = this.regressComparison((Comparison) t1.clone());
        regr.normalize();
        if (regr.isUnsatisfiable()) {
            return 0;
        }
//        System.out.println("Constraint:"+t1);
//        System.out.println("Regressed Constraint:"+regr);
        Float newDist = init.distance2(regr);
//        System.out.println("newDist:"+newDist);
//        System.out.println("prevDist:"+currentD);

        if (!newDist.isNaN() && currentD.isNaN()) {
            //System.out.println("The value of the current distance is not defined");
            return 1;
        }

        if (newDist > currentD) {

            return 1;
        }
        if (currentD.isNaN()) {
            //System.out.println("The value of the current distance is not defined");
            return 2;// this is the case in which the state has an undefined value.
        }
        return 0;
    }

    public Comparison improve2(PDDLState init, Comparison t1) throws Exception {
        if (!this.mayInfluence(t1)) {
            //System.out.println("Does not influence...");
            return null;
        }

        //System.out.println("Trying with:"+this);
        this.normalize();
        Float currentD = init.distance2(t1);
        if (currentD.isNaN()) {
            //System.out.println("The value of the current distance is not defined");
            currentD = -Float.MIN_VALUE;
        }
        Comparison regr = this.regressComparison((Comparison) t1.clone());
        regr.normalize();
//        System.out.println("Constraint:"+t1);
//        System.out.println("Regressed Constraint:"+regr);
        Float newDist = init.distance2(regr);
//        System.out.println("newDist:"+newDist);
//        System.out.println("prevDist:"+currentD);
        if (newDist > currentD) {

            return regr;
        }
        return null;
    }

    private boolean numericEffectUndefined(RelState current) {

        //if (numeric_effect_undefined == null) {//there is no action that can make a numeric fluent undefined. So this can be considered an invariant
        if (this.numericEffects == null) {
            return false;
        }
        if (this.numericEffects.sons.isEmpty()) {
            return false;
        }
        numeric_effect_undefined = this.numericEffects.sons.stream().anyMatch(new java.util.function.Predicate<NumEffect>() {
            @Override
            public boolean test(NumEffect e) {
                return e.getRight().eval(current).getInf().getNumber().isNaN();
            }
        });
        //}
        return numeric_effect_undefined;
//            

    }

    public boolean simplifyModelWithControllableVariablesSem(PddlDomain domain, EPddlProblem problem) throws Exception {

        HashMap invariantFluents = problem.getActualFluents();
        //add invariantFluents because free variable
        for (NumFluent nf : (Collection<NumFluent>) domain.get_derived_variables()) {
            invariantFluents.put(nf.getName(), Boolean.FALSE);
        }

        PDDLGroundAction a = this;
        //a.normalizeAndCopy();
        boolean free_var_semantics = !domain.get_derived_variables().isEmpty();
        Condition con = a.getPreconditions();
        if (con != null) {
            con.setFreeVarSemantic(free_var_semantics);
            con = con.weakEval(problem.getInit(), invariantFluents);

            if (con == null || con.isUnsatisfiable()) {
                return false;
            }
        } else {
            return false;
        }
        if (con.isUnsatisfiable()) {
            return false;
        }

        Condition eff = a.getNumericEffects();
        eff.setFreeVarSemantic(free_var_semantics);
        eff = eff.weakEval(problem.getInit(), invariantFluents);

        a.cond_effects =  (AndCond) a.cond_effects.weakEval(problem.getInit(), invariantFluents);
        if (eff == null) {
//            System.out.println("Pruning because of the effect");
            return false;
        }
        //System.out.println(a.toPDDL());
        a.normalize();
//        if (a.isUnsatisfiable())
//            return false;
        //System.out.println(a.toPDDL());
        return true;
    }

    void simplifyModelWithControllableVariablesSem_old(PddlDomain domain, EPddlProblem problem) throws Exception {
        HashMap abstractInvariantFluents = domain.generateAbstractInvariantFluents();

        PDDLGroundAction a = this;
        //a.normalizeAndCopy();

        Condition con = a.getPreconditions();
        AndCond eff = a.getNumericEffects();
//                    System.out.println(con);
//                    System.out.println(eff);
        con.setFreeVarSemantic(true);

        con = con.weakEval(problem.getInit(), abstractInvariantFluents);
        if (con == null) {
            this.setName("");
            return;
        }

        if (eff instanceof AndCond) {
            for (Object o2 : eff.sons) {
                NumEffect nEff = (NumEffect) o2;
                //System.out.println(nEff.getRight().getClass());
                Expression rValue = nEff.getRight();
                //System.out.println("before" + rValue);
                rValue = rValue.weakEval(problem.getInit(), abstractInvariantFluents);
                if (rValue == null) {
                    this.setName("");
                    return;
                }
                nEff.setRight(rValue);
                //System.out.println("after" + rValue);

            }
        } else {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        //System.out.println(a.toPDDL());
        a.normalize();
        //System.out.println(a.toPDDL());
    }

    public void addPreconditions(Condition c) {
        if (this.getPreconditions() != null) {
            if (this.getPreconditions().sons != null) {
                this.getPreconditions().sons.add(c);
            } else {
                this.preconditions.sons = new LinkedHashSet();
                this.getPreconditions().sons.add(c);
            }
        } else {
            this.preconditions = new AndCond();
            this.preconditions.sons = new LinkedHashSet();
            this.getPreconditions().sons.add(c);
        }
    }

    private boolean effects_might_be_influenced() throws Exception {
        boolean ret = true;
        for (Object o : this.getNumericEffects().sons) {
            NumEffect nf = (NumEffect) o;
            //System.out.println("nf:"+nf.getRight().getClass());
            if (nf.getRight() instanceof ExtendedNormExpression) {
                ExtendedNormExpression ne = (ExtendedNormExpression) nf.getRight();
                //System.out.println(ne);
                if (!ne.isNumber()) {
                    return true;
                }
            } else if (!(nf.getRight() instanceof PDDLNumber)) {
                //System.out.println(nf.getRight());
                return true;
            }
        }

        return false;
    }

    //this type of influence is on the rhs, that is it reasons on just complex dependencies
    public boolean is_complexly_influenced_by(PDDLGroundAction a) {
        for (Object o : this.getNumericEffects().sons) {
            NumEffect nf = (NumEffect) o;
            //System.out.println(nf);
            if (nf.getRight().involve(a.getNumericFluentAffected())) {
                return true;
            }
//            if ((nf.getOperator().equals("increase"))|| (nf.getOperator().equals("increase")) && (a.getNumericFluentAffected().contains(nf.getFluentAffected())))
//                return true;

        }
        return false;
    }

    public void addAchievedComparison(Condition c_1) {
        if (this.achievedComparisons == null) {
            this.achievedComparisons = new HashSet();
        }
        this.achievedComparisons.add(c_1);
    }

    /**
     * @return the reacheable
     */
    public boolean isReacheable() {
        return reacheable;
    }

    /**
     * @param reacheable the reacheable to set
     */
    public void setReacheable(boolean reacheable) {
        this.reacheable = reacheable;
    }

    public boolean assign_unassigned_fluent(PDDLState s) {
        if (this.getNumericEffects() == null) {
            return false;
        }
        boolean some_change = false;
        //for (Conditions c = this.getNumericEffects().sons){
        ArrayList temporaryMod = new ArrayList();
        HashMap fun2numb = new HashMap();
        for (Object o : this.getNumericEffects().sons) {

            NumEffect all = (NumEffect) o;
            PDDLNumber newN;
            NumFluent f = all.getFluentAffected();
            if (s.functionValue(f) == null) {
                if (all.getOperator().equals("assign")) {
                    //System.out.println("================ASSIGN===========");
                    Float rValue = all.getRight().eval(s).getNumber();
                    newN = new PDDLNumber(rValue);
                    temporaryMod.add(f);
                    fun2numb.put(f, newN);
                    some_change = true;
                }

            }
        }
        for (Object o : temporaryMod) {
            NumFluent f = (NumFluent) o;
            PDDLNumber n = (PDDLNumber) fun2numb.get(f);
            s.setFunctionValue(f, n);
            //System.out.println(s.printFluentByName("in-at"));
        }

        return some_change;
    }

    public boolean preconditioned_on(Condition c) {
        if (this.getPreconditions() == null) {
            return false;
        }
        if (this.getPreconditions().sons == null)//assuming action preconditions are given as set of atoms
        {
            return false;
        }
        for (Condition cond : (Collection<Condition>) this.getPreconditions().sons) {
            if (cond.getHeuristicId() == c.getHeuristicId()) {
                return true;
            }
        }
        return false;

    }

    public Float getNumberOfExecutionInt(PDDLState s_0, Comparison comp) {
        float a1;
        float b;

//        if (!this.interact_with(comp)){
//            return Integer.MAX_VALUE;
//        }
        if (!comp.involve(this.getNumericFluentAffected())) {
            return Float.MAX_VALUE;
        }

//        if (comp.eval_to_null(s_0)){
//            Comparison reg = this.regressComparison(comp);
//            if (s_0.satisfy(comp)){
//                return 1;
//            }
//        }
        a1 = comp.eval_not_affected(s_0, this);
        b = comp.eval_affected(s_0, this);
        if (b < 0.0) {
//            System.out.println(a1);
//            System.out.println(b);
//            //System.out.println("DEBUG:"+s_0);
//            System.out.println("DEBUG: "+this.toEcoString()+" is considered negative for:"+comp);
            return Float.MAX_VALUE;//the action contributes negatively
        }

        //Assumption: comparisons are normalized!
        if (comp.getComparator().equals("=")) {
            int m1 = (int) (-a1 / b);
            if (m1 < 0 || a1 % b != 0) {
                return Float.MAX_VALUE;
            } else {
                return (float) m1;
            }
        } else {//it is >= or >
            float m1 = -a1 / b;
            if (m1 >= 0) {
                if (comp.getComparator().equals(">")) {
                    m1 += 1;
                }
                return (float) Math.ceil(m1);
            } else {
                return Float.MAX_VALUE;
            }
        }
    }

    public Float getNumberOfExecution(PDDLState s_0, Comparison comp) {
        Float a1;
        Float b;

//        if (!this.interact_with(comp)){
//            return Float.MAX_VALUE;
//        }
        if (!comp.involve(this.getNumericFluentAffected())) {
            return Float.MAX_VALUE;
        }

//        if (comp.eval_to_null(s_0)){
//            Comparison reg = this.regressComparison(comp);
//            if (s_0.satisfy(comp)){
//                return 1;
//            }
//        }
        a1 = comp.eval_not_affected(s_0, this);
        if (a1 == Float.NaN) {
            return Float.MAX_VALUE;
        }
        b = comp.eval_affected(s_0, this);
        if (b == Float.NaN) {
            return Float.MAX_VALUE;
        }
        if (a1 == null || b == null) {
            return Float.MAX_VALUE;
        }
        if (b < 0.0) {
//            System.out.println(a1);
//            System.out.println(b);
//            //System.out.println("DEBUG:"+s_0);
//            System.out.println("DEBUG: "+this.toEcoString()+" is considered negative for:"+comp);
            return Float.MAX_VALUE;//the action contributes negatively
        }

        //Assumption: comparisons are normalized!
        if (comp.getComparator().equals("=")) {
            Float m1 = (-a1 / b);
            if (m1 < 0 || a1 % b != 0) {
                return Float.MAX_VALUE;
            } else {
                return m1;
            }
        } else {//it is >= or >
            float m1 = -a1 / b;
            if (m1 >= 0) {
                if (comp.getComparator().equals(">")) {
                    m1 += 0.00001;//epsilon
                }
                return m1;
            } else {
                return Float.MAX_VALUE;
            }
        }
    }

    public int getNumberOfExecutionWithoutCache(PDDLState s_0, Comparison comp) {
        float a1;
        float b;

//        if (!this.interact_with(comp)){
//            return Integer.MAX_VALUE;
//        }
        if (!comp.involve(this.getNumericFluentAffected())) {
            return Integer.MAX_VALUE;
        }

//        if (comp.eval_to_null(s_0)){
//            Comparison reg = this.regressComparison(comp);
//            if (s_0.satisfy(comp)){
//                return 1;
//            }
//        }
        a1 = comp.eval_not_affected(s_0, this);
        b = comp.eval_affected(s_0, this);
        if (b < 0.0) {
//            System.out.println(a1);
//            System.out.println(b);
//            //System.out.println("DEBUG:"+s_0);
//            System.out.println("DEBUG: "+this.toEcoString()+" is considered negative for:"+comp);
            return Integer.MAX_VALUE;//the action contributes negatively
        }

        //Assumption: comparisons are normalized!
        if (comp.getComparator().equals("=")) {
            int m1 = (int) (-a1 / b);
            if (m1 < 0 || a1 % b != 0) {
                return Integer.MAX_VALUE;
            } else {
                return m1;
            }
        } else {//it is >= or >
            float m1 = -a1 / b;
            if (m1 >= 0) {
                if (comp.getComparator().equals(">")) {
                    m1 += 1;
                }
                return (int) Math.ceil(m1);
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    public int getBoundOnTheNumberOfExecution(PDDLState s_0, Comparison comp) {
        float a1;
        float b;

        if (!comp.involve(this.getNumericFluentAffected())) {
            return Integer.MAX_VALUE;
        }
//        if (comp.eval_to_null(s_0)){
//            Comparison reg = this.regressComparison(comp);
//            if (s_0.satisfy(comp)){
//                return 1;
//            }
//        }
        a1 = comp.eval_not_affected(s_0, this);
        b = comp.eval_affected(s_0, this);
//        System.out.println(a1);
//        System.out.println(b);
        //Assumption: comparisons are normalized!
        if (comp.getComparator().equals("=")) {
            int m1 = (int) (-a1 / b);
            if (m1 < 0 || a1 % b != 0) {
                return Integer.MAX_VALUE;
            } else {
                return m1;
            }
        } else {//it is >= or >
            float m1 = -a1 / b;
            if (m1 >= 0) {
                if (comp.getComparator().equals(">")) {
                    m1 += 1;
                }
                return (int) Math.ceil(m1);
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    public Float getCoefficientAffected(NumFluent f) {
        this.generateCoefficeintAffected();
        return this.coefficientAffected.get(f);
    }

    private void generateCoefficeintAffected() {

        if (coefficientAffected != null) {
            return;
        }
        if (this.getNumericEffects() == null) {
            return;
        }

        coefficientAffected = new HashMap();
        for (Object c : this.getNumericEffects().sons) {
            NumEffect nEff = (NumEffect) c;
            ExtendedNormExpression right = (ExtendedNormExpression) nEff.getRight();
            if (nEff.getOperator().equals("increase") || nEff.getOperator().equals("decrease")) {
                coefficientAffected.put(nEff.getFluentAffected(), 1 + right.getCoefficient(nEff.getFluentAffected()));
            } else {
                coefficientAffected.put(nEff.getFluentAffected(), right.getCoefficient(nEff.getFluentAffected()));
            }
        }

    }

    public Float getValueOfRightExpApartFromAffected(NumFluent f, PDDLState s_0) {
        for (Object c : this.getNumericEffects().sons) {
            NumEffect nEff = (NumEffect) c;
            if (nEff.getFluentAffected().equals(f)) {
                ExtendedNormExpression right = (ExtendedNormExpression) nEff.getRight();
                if (nEff.getOperator().equals("increase")) {
                    return right.eval_apart_from_f(f, s_0);
                } else if (nEff.getOperator().equals("decrease")) {
                    return right.eval_apart_from_f(f, s_0) * -1.0f;

                }
                return right.eval_apart_from_f(f, s_0);
            }

        }
        System.err.println("Some errors occured");
        System.exit(-1);
        return null;
    }

    /**
     * @return the action_cost
     */
    public float getAction_cost() {

        return action_cost;
    }

    public void set_unit_cost(PDDLState s_0) {
        if (action_cost == null) {

            action_cost = 1f;
        }

    }
    
    public void clearActionCost(){
        action_cost = null;
    }

    /**
     * @param action_cost the action_cost to set
     */
    public void setAction_cost(float action_cost) {
        this.action_cost = action_cost;
    }

    public NumEffect getAffectorOf(NumFluent f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addNumericFluentAffected(NumFluent fluentAffected) {
        if (this.numericFluentAffected == null) {
            this.numericFluentAffected = new HashMap();
        }
        this.numericFluentAffected.put(fluentAffected, Boolean.TRUE);
    }

    public Comparison regressComparisonMtimes(Comparison comparison) throws CloneNotSupportedException {

        AndCond temp = new AndCond();
        if (this.getNumericEffects() != null) {
            for (NumEffect ne : (Collection<NumEffect>) this.getNumericEffects().sons) {
                NumFluent m = new NumFluent(this.toVariableString());//generate the variable capturin the m repetition
                temp.sons.add(ne.generate_m_times_extension(m));//assuming that m is an integer
            }
        }
        PDDLGroundAction grTemp = new PDDLGroundAction();
        grTemp.setNumericEffects(temp);
        return grTemp.regressComparison(comparison);

    }

    public boolean depends_on(PDDLGroundAction ele) {
        if (this.getNumericEffects() == null) {
            return false;
        }
        for (NumEffect ne : (Collection<NumEffect>) this.getNumericEffects().sons) {
//            if (ne.getOperator().equals("increase") || (ne.getOperator().equals("decrease"))){
//                if (ne.getFluentAffected().involve(ele.numericFluentAffected))
//                    return true;
//            }

            ele.generateAffectedNumFluents();
            if (ne.getRight().involve(ele.numericFluentAffected)) {
                return true;
            }
        }
        return false;
    }

    private boolean interact_with(Comparison comp) {
        Boolean ret = interact_with.get(comp.getHeuristicId());
        if (ret == null) {
            if (comp.involve(this.getNumericFluentAffected())) {
                interact_with.put(comp.getHeuristicId(), Boolean.TRUE);
                return true;
            } else {
                interact_with.put(comp.getHeuristicId(), Boolean.FALSE);
                return false;
            }
        }
        return ret;
    }

    public boolean is_possible_achiever_of(Comparison comp) {
        float positiveness = 0;
        if (this.getNumericEffectsAsCollection().isEmpty()) {
            return false;
        }
        if (comp.getLeft() instanceof ExtendedNormExpression) {
            ExtendedNormExpression left = (ExtendedNormExpression) comp.getLeft();
            for (ExtendedAddendum ad : left.summations) {
                if (ad.f != null) {
                    for (NumEffect ne : this.getNumericEffectsAsCollection()) {
                        if (!ne.getFluentAffected().equals(ad.f)) {
                            continue;
                        }
                        if (ne.isPseudo_num_effect()) {
                            return true;
                        }
                        if (ne.rhsFluents().isEmpty()) {
                            ExtendedNormExpression rhs = (ExtendedNormExpression) ne.getRight();

                            if (!rhs.linear) {
                                return false;
                            }
                            if (ne.getOperator().equals("increase")) {
                                if (ne.isPseudo_num_effect()) {

                                } else {
                                    try {
                                        positiveness += rhs.getNumber().getNumber() * ad.n.getNumber();
                                    } catch (Exception ex) {
                                        Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            } else if (ne.getOperator().equals("decrease")) {
                                try {
                                    positiveness += (-1) * rhs.getNumber().getNumber() * ad.n.getNumber();
                                } catch (Exception ex) {
                                    Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } else if (ne.getOperator().equals("assign")) {
                                try {
                                    positiveness += rhs.getNumber().getNumber() * ad.n.getNumber();
                                } catch (Exception ex) {
                                    Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        } else {
                            return false;
                        }

                    }
                }
            }
            if (positiveness > 0) {
                return true;
            }

        } else {
            System.out.println("At the moment only normalized expressions are considered");
            System.exit(-1);
        }
        return false;
    }

    public int internal_dependencies_length() {

        if (this.int_depencies != null) {
            return this.int_depencies;
        }
        int_depencies = 0;
        if (this.getNumericEffects() != null) {
            Collection<NumEffect> col = this.getNumericEffects().sons;
            HashMap<NumEffect, Boolean> visited = new HashMap();
            for (NumEffect a : col) {
                int_depencies = Math.max(int_depencies, dependency_length(a, col, visited));
            }
        }

        return this.int_depencies;

    }

    private int dependency_length(NumEffect a, Collection<NumEffect> col, HashMap<NumEffect, Boolean> visited) {
        if (visited.get(a) == null) {
            visited.put(a, true);//to prevent cycle
            int max_dependency_length = 0;
            for (NumEffect b : col) {
                if (!a.equals(b)) {
                    if (a.getInvolvedFluents().contains(b.getFluentAffected())) {
                        max_dependency_length = Math.max(max_dependency_length, dependency_length(b, col, (HashMap<NumEffect, Boolean>) visited.clone()) + 1);
                    }
                }
            }
            return max_dependency_length;
        } else {
            return 0;
        }
    }

    public RelState apply_with_generalized_interval_based_relaxation_copy(RelState s) {
        RelState s_copied = null;
        s_copied = s.clone();
        return apply_with_generalized_interval_based_relaxation(s_copied);
    }

    public RelState apply_with_generalized_interval_based_relaxation(RelState s) {
        HashMap subst = new HashMap();
        AndCond del = (AndCond) delList;
        if (del != null) {
            subst.putAll(del.apply(s));
        }
        AndCond add = (AndCond) addList;
        if (add != null) {
            subst.putAll(add.apply(s));
        }

        AndCond c = (AndCond) this.getNumericEffects();
//        System.out.println("GroundAction:"+this);
        subst.putAll(c.apply(s));

        if (this.cond_effects != null) {
            AndCond c_eff = (AndCond) this.cond_effects;
            subst.putAll(c_eff.apply(s));
        }

        for (final Object o : subst.keySet()) {
            if (o instanceof NumFluent) {
                NumFluent nf = (NumFluent) o;
                if (nf.has_to_be_tracked()) {

                    s.setFunctionValues(nf, (Interval) subst.get(o));

                }
            } else {
                s.poss_interpretation.put((Predicate) o, (Integer) subst.get(o));
            }
        }
        return s;
    }

    public boolean has_complex_preconditions() {

        if (this.getPreconditions() == null || this.getPreconditions().sons.isEmpty()) {
            return false;
        }

        for (Condition c : (Collection<Condition>) this.getPreconditions().sons) {
            if (c instanceof Comparison) {
                Comparison comp = (Comparison) c;
                if (comp.getLeft() instanceof ExtendedNormExpression) {
                    ExtendedNormExpression a = (ExtendedNormExpression) comp.getLeft();
                    for (ExtendedAddendum ad : a.summations) {
                        if (ad.bin != null) {
                            return true;
                        }
                    }

                }
                if (comp.getRight() instanceof ExtendedNormExpression) {
                    ExtendedNormExpression a = (ExtendedNormExpression) comp.getRight();
                    for (ExtendedAddendum ad : a.summations) {
                        if (ad.bin != null) {
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }

    public boolean has_exponential_or_nl_effects_asymptotic_effects() {
        if (this.getNumericEffects() == null || this.getNumericEffects().sons.isEmpty()) {
            return false;
        }
        for (NumEffect neff : this.getNumericEffectsAsCollection()) {
            NumFluent nf = neff.getFluentAffected();

            if (neff.getRight() instanceof ExtendedNormExpression) {
                ExtendedNormExpression right = (ExtendedNormExpression) neff.getRight();
                for (ExtendedAddendum ad : right.summations) {
                    if (ad.bin != null) {
                        return true;
                    }
                    if (ad.f != null) {
                        if (ad.f.equals(nf)) {
                            if (ad.n.getNumber() != 1.0f || ad.n.getNumber() != .0f) {
                                return true;
                            }
                        }
                    }

                }
            }

        }
        return false;
    }

    public boolean has_additive_effects() {
        if (this.getNumericEffects() == null || this.getNumericEffects().sons.isEmpty()) {
            return false;
        }
        for (NumEffect neff : this.getNumericEffectsAsCollection()) {
            if (neff.getOperator().equals("increase") || neff.getOperator().equals("decrease")) {
                return true;
            }

        }
        return false;

    }

    public boolean has_state_dependent_effects() {
        if (has_state_dependent_effects != null) {
            return has_state_dependent_effects;
        }

        if (this.getNumericEffects() == null || this.getNumericEffects().sons.isEmpty()) {
            has_state_dependent_effects = false;
        } else {
            for (NumEffect neff : this.getNumericEffectsAsCollection()) {
                if (!(neff.getRight() instanceof PDDLNumber)) {
                    has_state_dependent_effects = true;
                    break;
                }
            }
        }

        return has_state_dependent_effects;
    }

    public boolean delete_own_preconditions() {//to do

//        AndCond
        return false;
    }

    public PostCondition getAdder(Predicate aThis) {
        for (PostCondition eff : (Collection<PostCondition>) this.addList.sons) {
            if (((Predicate) eff).equals(aThis)) {
                return eff;
            }
        }
        for (PostCondition eff : (Collection<PostCondition>) this.cond_effects.sons) {
            ConditionalEffect c_eff = (ConditionalEffect) eff;
//            Predicate p = (Predicate)c_eff.effect;
            if (c_eff.effect instanceof AndCond) {
                AndCond and = (AndCond) c_eff.effect;
                if (and.getInvolvedPredicates().contains(aThis)) {
                    return c_eff;
                }
            }
            if (c_eff.effect.equals(aThis)) {
                return c_eff;
            }
        }
        return null;
    }

    public PostCondition getDeleter(Predicate aThis) {
        for (PostCondition eff : (Collection<PostCondition>) this.delList.sons) {
            NotCond n_eff = (NotCond) eff;
            Predicate p = (Predicate) n_eff.getSon();
            if (p.equals(aThis)) {
                return p;
            }
        }
        for (PostCondition eff : (Collection<PostCondition>) this.cond_effects.sons) {
            ConditionalEffect c_eff = (ConditionalEffect) eff;
            //for now single condition effect. Extend to andcond
            if (c_eff.effect instanceof AndCond) {
                AndCond and = (AndCond) c_eff.effect;
                for (Condition c : (Collection<Condition>) and.sons) {
                    if (c instanceof NotCond) {
                        NotCond n_eff = (NotCond) c;
                        Predicate p = (Predicate) n_eff.getSon();
//                System.out.println("DEBUG: Comparing: "+p+" with "+aThis);
                        if (p.equals(aThis)) {
//                    System.out.println("DEBUG: Equal");
                            return c_eff;
                        }
                    }
                }
            }
            if (c_eff.effect instanceof NotCond) {
                NotCond n_eff = (NotCond) c_eff.effect;
                Predicate p = (Predicate) n_eff.getSon();
//                System.out.println("DEBUG: Comparing: "+p+" with "+aThis);
                if (p.equals(aThis)) {
//                    System.out.println("DEBUG: Equal");
                    return c_eff;
                }
            }

        }
        return null;
    }


    void subst_predicate(Predicate p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OrCond getAdders(Predicate aThis) {
        OrCond or = new OrCond();
        or.addConditions(new Predicate(Predicate.true_false.FALSE));

        if (this.addList instanceof AndCond) {
            AndCond and = (AndCond) this.addList;
            Condition c = and.achieve(aThis);
            if (c != null) {
                or.addConditions(c);
            }
        }
        for (ConditionalEffect c : (Collection<ConditionalEffect>) this.cond_effects.sons) {
            Condition c1 = c.achieve(aThis);
            if (c1 != null) {
                or.addConditions(c1);
            }
        }
        return or;
    }

    public OrCond getDels(Predicate aThis) {
        OrCond or = new OrCond();
        or.addConditions(new Predicate(Predicate.true_false.FALSE));
        if (this.delList instanceof AndCond) {
            AndCond and = (AndCond) this.delList;
            Condition c = and.delete(aThis);
            if (c != null) {
                or.addConditions(c);
            }
        }
        for (ConditionalEffect c : (Collection<ConditionalEffect>) this.cond_effects.sons) {
            Condition c1 = c.delete(aThis);
            if (c1 != null) {
                or.addConditions(c1);
            }
        }
        return or;
    }

    public Float getStaticContribution(PDDLState s_0, Condition c) {

        if (c instanceof Predicate) {
            if (this.achieve((Predicate) c)) {
                return 1f;
            } else {
                return 0f;
            }
        } else {
            return this.getStaticContribution((Comparison) c);
        }

    }

    public Float getContribution(PDDLState s_0, Comparison comp) {

        Float b = comp.eval_affected(s_0, this);
        if (b <= 0) {
            return Float.MAX_VALUE; //the action is not a possible achiever
        }
        return b;
    }

    public Float getStaticContribution(Comparison comp) {
        Float positiveness = 0f;

        if (comp.getLeft() instanceof ExtendedNormExpression) {
            ExtendedNormExpression left = (ExtendedNormExpression) comp.getLeft();
            for (ExtendedAddendum ad : left.summations) {
                if (ad.f != null) {
                    for (NumEffect ne : this.getNumericEffectsAsCollection()) {
                        if (!ne.getFluentAffected().equals(ad.f)) {
                            continue;
                        }

                        if (ne.rhsFluents().isEmpty()) {
                            ExtendedNormExpression rhs = (ExtendedNormExpression) ne.getRight();

                            if (!rhs.linear) {
                                return Float.MAX_VALUE;
                            }
                            if (ne.getOperator().equals("increase")) {
                                if (ne.isPseudo_num_effect()) {

                                } else {
                                    try {
                                        positiveness += rhs.getNumber().getNumber() * ad.n.getNumber();
                                    } catch (Exception ex) {
                                        Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            } else if (ne.getOperator().equals("decrease")) {
                                try {
                                    positiveness += (-1) * rhs.getNumber().getNumber() * ad.n.getNumber();
                                } catch (Exception ex) {
                                    Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } else if (ne.getOperator().equals("assign")) {
                                try {
                                    positiveness += rhs.getNumber().getNumber() * ad.n.getNumber();
                                } catch (Exception ex) {
                                    Logger.getLogger(PDDLGroundAction.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        } else {
                            return Float.MAX_VALUE;
                        }

                    }
                }
            }
            return positiveness;
        }
        return positiveness;

    }

    public boolean hasApplicableEffects(PDDLState s) {
        for (NumEffect e : this.getNumericEffectsAsCollection()) {
            if (e.getOperator().equalsIgnoreCase("increase") || e.getOperator().equalsIgnoreCase("decrease")) {

                if (s.functionValue(e.getFluentAffected()) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setAction_cost(PDDLState init, Metric metric) {

        if (metric != null && metric.getMetExpr() != null) {
            NumEffect neff = new NumEffect("increase");

            neff.setFluentAffected(new NumFluent("total-time"));
            PDDLNumber n = new PDDLNumber(1.0f);
            ExtendedNormExpression expr1 = n.normalize();
            neff.setRight(expr1);
            //neff.normalize();
            this.numericEffects.sons.add(neff);
            this.forcedGenerateAffectedNumFluents();
            ExtendedNormExpression expr = (ExtendedNormExpression) metric.getMetExpr();
            float cont = expr.eval_affected(init, this);
            this.getNumericEffects().sons.remove(neff);
            this.forcedGenerateAffectedNumFluents();
            if (cont == 0) {
                this.action_cost = 0f;
            } else if (metric.getOptimization().equals("maximise")) {
                if (cont < 0) {
                    this.action_cost = cont;
                } else {
                    this.action_cost = 0f;
                }
            } else if (cont > 0) {
                this.action_cost = cont;
            } else {
                this.action_cost = 0f;
            }
        } else {
            this.set_unit_cost(init);
        }
//        System.out.println("DEBUG:"+this);
//        System.out.println("DEBUG:"+this.action_cost);

    }

    public boolean has_pseudo_numeric_effect_on(Condition c) {
        if (c instanceof Predicate) {
            return false;
        }
        Comparison comp = (Comparison) c;
        for (NumEffect eff : this.getNumericEffectsAsCollection()) {
            if (eff.isPseudo_num_effect()) {
                if (comp.getLeft().involve(eff.getFluentAffected())) {
                    return true;
                }
            }

        }
        return false;

    }


}
