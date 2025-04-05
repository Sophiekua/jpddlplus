package com.hstairs.ppmajal.pddl.heuristics.advanced;

import java.util.Collection;
import java.util.*;
import java.util.stream.Collectors;


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
import com.hstairs.ppmajal.conditions.BoolPredicate;

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
        double currentDoctorCost = getStateTotalDoctorCost((PDDLState) s);
        double futureDoctorCost = getMinFutureCost((PDDLState) s, (double) currentDoctorCost);

        Condition goals = this.problem.getGoals();

        if (goals instanceof AndCond) {
            for (Object c1 : ((AndCond) goals).sons) {
                Condition con = (Condition) c1;

                if (!s.satisfy(con)) { // if the state doesn't equal the goal condition then add 1 to c
                    missingGoals++;
                }
            }
        }

        float cost = (float) futureDoctorCost - (float) currentDoctorCost;
        float normCost = (float) cost/ (float) futureDoctorCost;
        float hValue = missingGoals + normCost;

        System.out.printf("doctorCost: %f\n", cost);
        System.out.printf("Out of Place Value: %f\n", hValue);
        return hValue;
    }

    public double getMinFutureCost(PDDLState s, double currentDoctorCost) {

        double minCost = currentDoctorCost;
        double genCost = 0.0;
        double specCost = 0.0; 

        double genAppointmentCost = 0.0;
        double specAppointmentCost = 0.0;

        Map<NumFluent, PDDLNumber> problemNumMap = problem.getInitNumFluentsValues();

        System.out.println(problemNumMap);
        // NumFluent generalCostFluent = problemMap.keySet().stream().filter(x -> x.getName().equals("doctor_type_cost").orElseThrow();
        // System.out.println("general type cost fluent: "+ generalCostFluent);

        Map<NumFluent, PDDLNumber> typeCostFluent = problemNumMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("doctor_type_cost")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(" type cost fluents : "+ typeCostFluent);

        for (Map.Entry<NumFluent, PDDLNumber> entry : typeCostFluent.entrySet()) {
            String fullName = entry.getKey().toString();  // Get full name (or use getName() if appropriate)
            
            if (fullName.contains("general")) {
                genCost = entry.getValue().getNumber().doubleValue();;
            } else if (fullName.contains("specialist")) {
                specCost = entry.getValue().getNumber().doubleValue();
            }
        }
        System.out.println("gen cost: "+ genCost + "specCost: " + specCost);

        Map<BoolPredicate, Boolean> problemBoolMap =  problem.getInitBoolFluentsValues();
        System.out.println(problemBoolMap);

        Map<BoolPredicate, Boolean> genAppointments = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("general_appointment")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(genAppointments);
        for (BoolPredicate i : genAppointments.keySet()){

            genAppointmentCost += genCost;
        }

        System.out.println(genAppointmentCost);

        Map<BoolPredicate, Boolean> specAppointments = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("specialist_appointment")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(specAppointments);
        for (BoolPredicate i : specAppointments.keySet()){

            specAppointmentCost += specCost;
        }
        System.out.println(specAppointmentCost);

        minCost = specAppointmentCost + genAppointmentCost;
            
        return minCost;
    }

    public double getStateTotalDoctorCost(PDDLState s) {

        System.out.println(s);

        // Look for the numeric fluent "total_doctor_cost"
        Map<NumFluent, PDDLNumber> problemMap = problem.getInitNumFluentsValues();

        System.out.println(problemMap);
        NumFluent doctorCostFluent = problemMap.keySet().stream().filter(x -> x.getName().equals("total_doctor_cost")).findFirst().orElseThrow();
        System.out.println("doctor cost fluent: "+ doctorCostFluent);

        if (doctorCostFluent == null) {
            System.err.println("Error: Fluent 'total_doctor_cost' not found.");
            return 0.0;  // Return a default value
        }

        double fluentValue = s.fluentValue(doctorCostFluent); //get value of cost fluent

        if (Double.isNaN(fluentValue)) {
             System.err.println("Error: 'total_doctor_cost' is NaN in the current state.");
             return 0.0;  // Return a default value
         }

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
