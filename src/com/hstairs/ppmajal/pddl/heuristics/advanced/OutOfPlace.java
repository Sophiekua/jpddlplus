package com.hstairs.ppmajal.pddl.heuristics.advanced;

import java.util.Collection;

import com.hstairs.ppmajal.PDDLProblem.PDDLProblem;
import com.hstairs.ppmajal.PDDLProblem.PDDLState;
import com.hstairs.ppmajal.conditions.AndCond;
import com.hstairs.ppmajal.conditions.Condition;
import com.hstairs.ppmajal.expressions.NumEffect;
import com.hstairs.ppmajal.expressions.NumFluent;
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

        for (Transition transition : problem.getTransitions()) {
            // Get all numeric effects from this transition
            Collection<NumEffect> numericEffects = transition.getAllNumericEffects();

            for (NumEffect numEffect : numericEffects) {
                // Check if the numeric effect involves the "total_doctor_cost" fluent
                if (numEffect.getFluentAffected().getName().equals("total_doctor_cost")) {
                    // Evaluate the numeric effect on the fluent
                    double effectValue = numEffect.getRight().eval(s);
                    System.out.println(effectValue);

                    futureDoctorCost += effectValue;
                }
            }
        }

        System.out.println(futureDoctorCost);
        System.out.println(currentDoctorCost);

        float cost = (float) currentDoctorCost + (float) futureDoctorCost;
        float hValue = missingGoals + (cost / 10);

        System.out.printf("doctorCost: %f\n", cost);
        System.out.printf("Out of Place Value: %f\n", hValue);
        return hValue;
    }

    public double getStateTotalDoctorCost(State s) {
        PDDLState pddlState = (PDDLState) s;  
        // Look for the numeric fluent "total_doctor_cost"
        NumFluent doctorCostFluent = (NumFluent) this.problem.getNumFluents().stream().filter(f -> ((NumFluent) f).getName().equals("total_doctor_cost")).findFirst().orElse(null);
        System.out.println(doctorCostFluent);

        if (doctorCostFluent != null) {
            // Find the correct numeric fluent ID in the state
            int[] id = PDDLState.getFromStateNFId2ProblemNFId();
            System.out.println("ID array length: " + id.length);
            System.out.println(id);
            if (doctorCostFluent.getId() >= id.length) {
                throw new RuntimeException("doctorCostFluent ID out of bounds: " + doctorCostFluent.getId() + ", max: " + id.length);
            }
            System.out.println("Doctor Cost Fluent ID: " + doctorCostFluent.getId());
            int costid = id[doctorCostFluent.getId()];
            // Return the value of the numeric fluent for the "total_doctor_cost" from the state
            return (double) pddlState.getNumFluents().get(costid);
        }
        return 0.0;
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
