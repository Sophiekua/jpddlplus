package com.hstairs.ppmajal.pddl.heuristics.advanced;

import java.util.ArrayList;

import com.hstairs.ppmajal.conditions.AndCond;
import com.hstairs.ppmajal.conditions.Condition;
import com.hstairs.ppmajal.PDDLProblem.PDDLProblem;
import com.hstairs.ppmajal.problem.State;
import com.hstairs.ppmajal.search.SearchHeuristic;
import com.hstairs.ppmajal.transition.TransitionGround;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.hstairs.ppmajal.expressions.NumFluent;
import com.hstairs.ppmajal.expressions.PDDLNumber;

/**
 *
 * @author enrico
 */
public class OutOfPlace implements SearchHeuristic {

    final private PDDLProblem problem;

    public OutOfPlace(PDDLProblem problem) {
        this.problem = problem;
    }

    // calculates an estimate for how far away the current state is from the goal
    @Override
    public float computeEstimate(State s) {
        int c = 0;
        float numDiff = 0;
        Condition goals = this.problem.getGoals();

        if (goals instanceof AndCond) {
            for (Object c1 : ((AndCond) goals).sons) {
                Condition con = (Condition) c1;
                if (!s.satisfy(con)) { // if the state doesn't equal the goal condition then add 1 to c
                    c++;

                }
                
            }

        }

        List<Double> stateNumFluent = s.getNumFluents();
        List NumFluentTest = s.getNumFluents();
        NumFluent NumFluentRef = this.problem.getNumfluentReference("total_doctor_cost");
        System.out.println(NumFluentTest);
        System.out.println(NumFluentRef);

        Set<NumFluent> goalFluents = problem.getGoals().getInvolvedFluents();
        //System.out.println(goalFluents);

        List<Double> goalNumFluent = new ArrayList<>();
        

        for (NumFluent nf : goalFluents) {
            PDDLNumber goalPDDLNumber = problem.getInitNumFluentsValues().get(nf);
            double goalValue = (goalPDDLNumber != null) ? goalPDDLNumber.getNumber().doubleValue() : 0.0;
            goalNumFluent.add(goalValue);
        }
        
        //System.out.println(goalFluents);

        int minSize = Math.min(stateNumFluent.size(), goalNumFluent.size());
        //System.out.println(minSize);

        for (int i = 0; i < minSize; i++) {
            numDiff += Math.abs(stateNumFluent.get(i) - goalNumFluent.get(i));
            System.out.printf("state fluent: %.2f\n", stateNumFluent.get(i));
        }

        float hValue = c + numDiff;
        System.out.printf("numDiff: %f\n", numDiff);
        System.out.printf("Out of Place Value: %f\n", hValue);
        return hValue;
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
