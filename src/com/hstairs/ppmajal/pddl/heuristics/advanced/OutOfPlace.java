package com.hstairs.ppmajal.pddl.heuristics.advanced;

import java.util.Collection;
import java.util.*;

import com.hstairs.ppmajal.PDDLProblem.PDDLProblem;
import com.hstairs.ppmajal.PDDLProblem.PDDLState;
import com.hstairs.ppmajal.conditions.AndCond;
import com.hstairs.ppmajal.conditions.Condition;
import com.hstairs.ppmajal.expressions.NumEffect;
import com.hstairs.ppmajal.expressions.NumFluent;
import com.hstairs.ppmajal.expressions.PDDLNumber;
import com.hstairs.ppmajal.problem.State;
import com.hstairs.ppmajal.search.SearchHeuristic;
import com.hstairs.ppmajal.transition.Transition;
import com.hstairs.ppmajal.transition.TransitionGround;

/**
 *
 * @author enrico, sophie Kua
 */
public class OutOfPlace implements SearchHeuristic {

    final private PDDLProblem problem;

    public OutOfPlace(PDDLProblem problem) {
        this.problem = problem;
    }

    // calculates an estimate for how far away the current state is from the goal
    @Override
    public float computeEstimate(State s) {
        int missingGoals = 0;
        double futureDoctorCost = 0.0;
        double currentDoctorCost = getStateTotalDoctorCost((PDDLState) s);

        Condition goals = this.problem.getGoals();

        if (goals instanceof AndCond) {
            for (Object c1 : ((AndCond) goals).sons) {
                Condition con = (Condition) c1;
                if (!s.satisfy(con)) { // if the state doesn't equal the goal condition then add 1 to c
                    missingGoals++;

                }

            }

        }

        float cost = (float) currentDoctorCost + (float) futureDoctorCost;
        float hValue = missingGoals + (cost);

        System.out.printf("doctorCost: %f\n", cost);
        System.out.printf("Out of Place Value: %f\n", hValue);
        return hValue;
    }

    public double getMinFutureStateCost(PDDLState s) {

        double minCost = Double.MAX_VALUE;

        for (Transition transition : problem.getTransitions()) {
            // Get all numeric effects from this transition
            Collection<NumEffect> numericEffects = transition.getAllNumericEffects();

            for (NumEffect numEffect : numericEffects) {
                // Check if the numeric effect involves the "total_doctor_cost" fluent
                if (numEffect.getFluentAffected().getName().equals("total_doctor_cost")) {
                    // Evaluate the numeric effect on the fluent
                    double effectValue = numEffect.getRight().eval(s);

                    System.out.println(effectValue);
                    if (effectValue > 0) {  // Ignore reductions, since we want the minimum cost to reach the goal
                        minCost = Math.min(minCost, effectValue);

                    }
                    if (minCost == Double.MAX_VALUE) {
                        // If no applicable transition affects total_doctor_cost, return a default value
                        System.err.println("No applicable transition affects total_doctor_cost. Returning default value.");
                        return 0.0;  // Or any default value you want for the case where no transitions apply
                    }
                    System.out.println(minCost);
                    // Return the minimum doctor cost

                }
            }
        }
        return minCost;
    }

    public double getStateTotalDoctorCost(PDDLState s) {

        System.out.println(s);

        System.out.println("All Numeric Fluents in Problem:");
        
        for (NumFluent f : problem.getNumFluentsInvolvedInInit()) {
            System.out.println("Fluent: " + f.getName() + " | ID: " + f.getId() + " | Terms: " + f.getTerms());
        }
        // Look for the numeric fluent "total_doctor_cost"
        Map<NumFluent, PDDLNumber> problemMap = problem.getInitNumFluentsValues();

        System.out.println(problemMap);
        NumFluent doctorCostFluent = problemMap.keySet().stream().filter(x -> x.getName().equals("total_doctor_cost")).findFirst().orElseThrow();
        System.out.println("doctor cost fluent: "+ doctorCostFluent);

        PDDLNumber thingy = problemMap.get(doctorCostFluent);

        double value = thingy.getNumber();
        System.out.println(thingy.getNumber());

        // Ensure the fluent is found and grounded
    
        if (doctorCostFluent == null) {
            System.err.println("Error: Fluent 'total_doctor_cost' not found.");
            return 0.0;  // Return a default value
        }

        // List statelist = s.getNumFluents();
        // System.out.println(statelist);

        double fluentValue = 0.0;

        for (NumFluent nf : NumFluent.numFluentsBank.values()) {
            fluentValue =  s.fluentValue(nf);
            System.out.println("fluent: " + nf + "value: " + fluentValue);

            involvedfluents = s.getInvolvedNumericFluents();
            //System.out.println("ID:" + nf.getId() + "->" + nf);
        }

        // Check for NaN and handle accordingly
        // if (Double.isNaN(fluentValue)) {
        //     System.err.println("Error: 'total_doctor_cost' is NaN in the current state.");
        //     return 0.0;  // Return a default value
        // }

        // Return the valid fluent value
        return fluentValue;
    }

    @Override
    public Object[] getTransitions(boolean helpful) {
        return problem.getActions().toArray();
    }

    @Override
    public Collection<TransitionGround> getAllTransitions() {
        return problem.getTransitions();
    }

}
