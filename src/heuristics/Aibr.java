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
package heuristics;

import conditions.Comparison;
import conditions.ComplexCondition;
import conditions.ConditionalEffect;
import conditions.Condition;
import domain.ParametersAsTerms;
import expressions.BinaryOp;
import expressions.NumEffect;
import expressions.PDDLNumber;
import extraUtils.Utils;
import heuristics.advanced.h1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import problem.PDDLGroundAction;
import problem.GroundEvent;
import problem.GroundProcess;
import problem.RelState;
import problem.PDDLState;

/**
 *
 * @author enrico
 */
public class Aibr extends Heuristic {

    boolean reachability;
    public boolean conservative = false;
    private boolean counting_layers = true;
    private boolean greedy_relaxed_plan = false;
    private boolean reversing = false;
    private HashMap<PDDLGroundAction, PDDLGroundAction> supp_to_action;
//    protected ArrayList<Integer> dist;
    public boolean layers_counter;
    private boolean cost_oriented = true;

    public Aibr(ComplexCondition G, Set<PDDLGroundAction> actions) {
        super(G, actions);
        this.supp_to_action = new HashMap();

        supporters = new LinkedHashSet();
        Utils.dbg_print(debug, "Generate Supporters\n");
        generate_supporters(A);
    }

    public Aibr(ComplexCondition G, Set<PDDLGroundAction> actions, Set<GroundProcess> processes) {
        super(G, actions, processes);
        this.supp_to_action = new HashMap();

        supporters = new LinkedHashSet();
//        Utils.dbg_print(debug, "Generate Supporters\n");
        generate_supporters(A);
//        Utils.dbg_print(debug, "Supporters Generated\n");

        //this.build_integer_representation();
    }

    public Aibr(ComplexCondition G, Set<PDDLGroundAction> actions, Set<GroundProcess> processes, Set<GroundEvent> events) {
        super(G, actions, processes, events);
        this.supp_to_action = new HashMap();

        supporters = new LinkedHashSet();
//        Utils.dbg_print(debug, "Generate Supporters\n");
        generate_supporters(A);
        
//        Utils.dbg_print(debug, "Supporters Generated\n");

        //this.build_integer_representation();
    }

    public void set(boolean counting_layers_active, boolean greedy_relaxed_plan_active) {
        this.counting_layers = counting_layers_active;
        this.greedy_relaxed_plan = greedy_relaxed_plan_active;
    }

    @Override
    public Float setup(PDDLState s_0) {
        reachability = true;

//        Utils.dbg_print(debug, "Computing Internal Data Structure\n");
        this.build_integer_representation();
//        Utils.dbg_print(debug, "Computing Reachable Actions\n");

        Float ret = compute_estimate(s_0);
        reachability = false;
        return ret;
    }

    public void light_setup(PDDLState s_0, h1 aThis) {
        this.all_conditions = aThis.all_conditions;

        reachability = false;
        this.reachable = A;

    }

    @Override
    public Float compute_estimate(PDDLState s) {
        RelState rs = s.relaxState();
        Collection<PDDLGroundAction> temp_supporters = new LinkedHashSet(supporters);//making a copy of the supporters so as not to delete the source
        int supporters_counter = 0;

        int i = 0;
        boolean exit = false;
        while (!exit) {//until  the goal is not satisfied || the procedure has been called in reacheability setting
//            Collection<GroundAction> S = temp_supporters.stream().filter(p -> p.isApplicable(rs)).collect(Collectors.toSet());//lambda function, Take the applicable action
//            Utils.dbg_print(1, "Relaxed State:" + rs + "\n");

            if (check_goal_condition(G, rs) && !reachability) {
                break;
            }
            LinkedHashSet<PDDLGroundAction> S = get_applicable_supporters(temp_supporters, rs);
//            Utils.dbg_print(1, "Applicable Supporter:" + S + "\n");
            if (S.isEmpty()) {//if there are no applicable actions then finish!
                if (!rs.satisfy(G)) {
                    if (reachability) {
                        reacheable_state = rs.clone();
                        this.reachable = new LinkedHashSet(A.stream().filter(p -> p.isApplicable(rs)).collect(Collectors.toList()));
                    }
//                    get_applicable_supporters(temp_supporters, rs, i);
                    return Float.MAX_VALUE;
                } else {
                    reacheable_state = rs.clone();
                    //this.reachable = new LinkedHashSet(A.stream().filter(p -> p.isApplicable(rs)).collect(Collectors.toList()));
                    break;
                }
            }

            if (reachability) {

//            if (true){
                for (PDDLGroundAction gr : S) {
                    gr.apply(rs);
                }
                //S.stream().forEach((GroundAction a) -> a.apply(rs));
                supporters_counter += S.size();
            } else {
                for (PDDLGroundAction gr : S) {
                    supporters_counter += S.size();
                    gr.apply(rs);
                    if (check_goal_condition(G, rs)) {
                        exit = true;
                        break;
                    }
                }
            }

            i++;
        }
//        Utils.dbg_print(debug, "Rechability finished");

//        System.out.println("Number of Transitions: "+A.size());
//        System.out.println("Number of Supporters: "+supporters.size());
        if (reachability) {

//            int counter_predicates = 0;
//            for (Predicate p : rs.poss_interpretation.keySet()){
//                if (rs.poss_interpretation.get(p) >0)
//                    counter_predicates++;
//            }
//            s.consolidate_propositions(rs);
//            System.out.println("Total Number of Predicates which makes sense"+counter_predicates);

            //reacheable_state = rs.clone();
            this.reachable = new LinkedHashSet(A.stream().filter(p -> p.isApplicable(rs)).collect(Collectors.toList()));
            this.supporters = new LinkedHashSet(supporters.stream().filter(p -> p.isApplicable(rs)).collect(Collectors.toList()));
            return (float) i;
        }
        if (layers_counter) {
            return (float) i;
        }
        if (conservative) {
            return (float) supporters_counter;
        }
        if (supporters_counter == 0) {
            return 0f;
        }

        RelState rs2 = s.relaxState();

        return fix_point_computation(s, rs2);

    }

    private void generate_supporters(Set<PDDLGroundAction> actions) {

        Collection<PDDLGroundAction> actions_plus_action_for_supporters = new LinkedHashSet();
        for (PDDLGroundAction gr : actions) {
            if (gr.cond_effects != null) {
//                System.out.println(gr);
                actions_plus_action_for_supporters.addAll(generate_actions_for_cond_effects(gr.getName(),gr.getParameters(), gr.cond_effects));
            }
        }
        //System.out.println(actions_plus_action_for_supporters);
        actions_plus_action_for_supporters.addAll(actions);
        for (PDDLGroundAction gr : actions_plus_action_for_supporters) {
            if (gr.getNumericEffects() != null && !gr.getNumericEffects().sons.isEmpty()) {
                for (NumEffect effect : (Collection<NumEffect>) gr.getNumericEffects().sons) {
                    effect.additive_relaxation = true;
                    if (effect.getOperator().equals("assign") && effect.getRight().rhsFluents().isEmpty()) {
                        supporters.add(generate_constant_supporter(effect, gr.toFileCompliant() + effect.getFluentAffected(), gr.getPreconditions(), gr));
                    } else {
                        supporters.add(generate_plus_inf_supporter(effect, gr.toFileCompliant() + effect.getFluentAffected(), gr.getPreconditions(), gr));
                        supporters.add(generate_minus_inf_supporter(effect, gr.toFileCompliant() + effect.getFluentAffected(), gr.getPreconditions(), gr));
                    }
                }
            }
            if ((gr.getAddList() != null && !gr.getAddList().sons.isEmpty()) || (gr.getDelList() != null && !gr.getDelList().sons.isEmpty())) {
                supporters.add(generate_propositional_action(gr.toFileCompliant() + "prop", gr.getPreconditions(), gr));
            }

        }
//        System.out.println("_");

    }

    private PDDLGroundAction generate_constant_supporter(NumEffect effect, String name, Condition precondition, PDDLGroundAction gr) {
        PDDLGroundAction ret = new PDDLGroundAction(name + "constantassign");
        NumEffect assign = new NumEffect("assign");
        assign.setFluentAffected(effect.getFluentAffected());
        assign.setRight(effect.getRight());
        ret.getNumericEffects().sons.add(assign);
        ret.setPreconditions(ret.getPreconditions().and(precondition));
        this.supp_to_action.put(ret, gr);
        return ret;
    }

    private PDDLGroundAction generate_plus_inf_supporter(NumEffect effect, String name, Condition precondition, PDDLGroundAction gr) {
        String disequality = "";
        Float asymptote = Float.MAX_VALUE;
        switch (effect.getOperator()) {
            case "increase":
                disequality = ">";
                break;
            case "decrease":
                disequality = "<";
                break;
            case "assign":
                disequality = ">";
                break;
        }
        return generate_supporter(effect, disequality, asymptote, name + "plusinf", precondition, gr);
    }

    private PDDLGroundAction generate_supporter(NumEffect effect, String inequality, Float asymptote, String name, Condition precondition, PDDLGroundAction gr) {
        PDDLGroundAction ret = new PDDLGroundAction(name);
        Comparison indirect_precondition = new Comparison(inequality);
        if (effect.getOperator().equals("assign")) {
            indirect_precondition.setLeft(new BinaryOp(effect.getRight(), "-", effect.getFluentAffected(), true));
        } else {
            indirect_precondition.setLeft(effect.getRight());
        }
        indirect_precondition.setRight(new PDDLNumber(0));
        ret.getPreconditions().sons.add(indirect_precondition);
        NumEffect eff = new NumEffect("assign");
        eff.setFluentAffected(effect.getFluentAffected());
        eff.setRight(new PDDLNumber(asymptote));
        ret.setPreconditions(ret.getPreconditions().and(precondition));
        ret.getNumericEffects().sons.add(eff);
        this.supp_to_action.put(ret, gr);
        return ret;
    }

    private PDDLGroundAction generate_minus_inf_supporter(NumEffect effect, String name, Condition precondition, PDDLGroundAction gr) {
        String disequality = "";
        Float asymptote = -Float.MAX_VALUE;
        switch (effect.getOperator()) {
            case "increase":
                disequality = "<";
                break;
            case "decrease":
                disequality = ">";
                break;
            case "assign":
                disequality = "<";
                break;

        }
        return generate_supporter(effect, disequality, asymptote, name + "minusinf", precondition, gr);
    }

    private PDDLGroundAction generate_propositional_action(String name, ComplexCondition cond, PDDLGroundAction gr) {
        PDDLGroundAction ret = new PDDLGroundAction(name);
        ret.setPreconditions(cond);
        ret.setAddList(gr.getAddList());
        ret.setDelList(gr.getDelList());
        this.supp_to_action.put(ret, gr);

        return ret;
    }

    private Float fix_point_computation(PDDLState s, RelState rs2) {
        Float counter = 0f;
        Float layer_counter = 0f;
        while (counter <= horizon) {
            if (debug > 10) {
                System.out.println("L(" + layer_counter + ")Relaxed State: " + rs2);
            }

            boolean fix_point = true;
            layer_counter++;
            for (PDDLGroundAction gr : this.reachable) {
                if (gr.isApplicable(rs2)) {
                    gr.apply_with_generalized_interval_based_relaxation(rs2);
                    if (debug > 10) {
                        System.out.println("L(" + layer_counter + ")Action/Process: " + gr);
                    }
                    //counter++;//=
                    if (cost_oriented) {
//                        gr.set_unit_cost(s);
                        counter += gr.getAction_cost();
                    } else {
                        counter++;
                    }
                    fix_point = false;
                    if (rs2.satisfy(G) && greedy_relaxed_plan) {
                        if (counting_layers) {
                            return layer_counter;
                        } else {
                            return counter;
                        }
                    }
                }
                //                    System.out.println("Reacheability Iteration: "+counter);
            }
            if (!greedy_relaxed_plan) {
                if (rs2.satisfy(G)) {
                    if (counting_layers) {
                        return layer_counter;
                    } else {
                        return counter;
                    }
                }
            }

            if (fix_point) {
                System.out.println("Anomaly!");
                //return Integer.MAX_VALUE;
            }
        }

        return counter;
    }

    //The following is too weak as it only reason qualitatively! Needs to define concept of regression in the interval case.
    private LinkedHashSet<PDDLGroundAction> get_applicable_supporters(Collection<PDDLGroundAction> temp_supporters, RelState rs) {
        LinkedHashSet<PDDLGroundAction> ret = new LinkedHashSet();
        Iterator<PDDLGroundAction> it = temp_supporters.iterator();
        while (it.hasNext()) {
            PDDLGroundAction gr = it.next();
            if (gr.getPreconditions().isSatisfied(rs)) {
                ret.add(gr);
                it.remove();
            }
        }
        return ret;

    }

    private boolean check_goal_condition(Condition G, RelState rs) {
        return G.isSatisfied(rs);
    }

    private boolean achiever(PDDLGroundAction gr, RelState rs2, Condition g) {
        RelState temp = rs2.clone();
        if (gr.apply(temp).satisfy(g)) {
            return true;
        }
        return false;

    }

    private Collection<? extends PDDLGroundAction> generate_actions_for_cond_effects(String name,ParametersAsTerms p, ComplexCondition cond_effects) {
        Set ret = new LinkedHashSet();
        Integer counter = 0;
        for (Object o : cond_effects.sons) {
            if (o instanceof ConditionalEffect) {
                ConditionalEffect cond = (ConditionalEffect) o;
                PDDLGroundAction a = new PDDLGroundAction(name + counter);
                a.setParameters(p);
                a.setPreconditions(a.getPreconditions().and(cond.activation_condition));
                a.create_effects_by_cases(cond.effect);
                ret.add(a);
                counter++;
            }else{
                throw new RuntimeException("Error!!");
            }
        }
        return ret;

    }
    
    public RelState get_reachable_state(PDDLState s, RelState rs2){
        while (true) {
            boolean fix_point = true;
            for (PDDLGroundAction gr : this.reachable) {
                if (gr.isApplicable(rs2)) {
                    gr.apply_with_generalized_interval_based_relaxation(rs2);
                    fix_point = false;
                    if (rs2.satisfy(G)) {
                       return rs2;
                    }
                }
            }

            if (fix_point) {
                System.out.println("Anomaly!");
            }
        }
    }
}
