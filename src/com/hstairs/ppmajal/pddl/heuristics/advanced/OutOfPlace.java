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

        //float cost = (float) futureDoctorCost - (float) currentDoctorCost;
       
        float hValue = missingGoals + (float) futureDoctorCost;
        //float hValue = missingGoals + (float) cost;
        System.out.printf("doctorCost: %f\n", futureDoctorCost);
        System.out.printf("Out of Place Value: %f\n", hValue);
        return hValue;
    }

    public double getMinFutureCost(PDDLState s, double currentDoctorCost) {

        double minCost = 0.0;
        double genCost = 0.0;
        double specCost = 0.0; 

        double genAppointmentCost = 0.0;
        double specAppointmentCost = 0.0;

        Map<NumFluent, PDDLNumber> problemNumMap = problem.getInitNumFluentsValues();
        Map<BoolPredicate, Boolean> problemBoolMap =  problem.getInitBoolFluentsValues();

        //System.out.println(problemNumMap);
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

        Map<BoolPredicate, Boolean> doctorType = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("specialises_in")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("doctor type fluents : "+ doctorType);

        Map<String, Double> doctorCosts = new HashMap<>();

        // Iterate through the doctor specializations and assign the corresponding costs
        for (Map.Entry<BoolPredicate, Boolean> entry : doctorType.entrySet()) {
            String fullName = entry.getKey().toString();  
            boolean isSpecialist = entry.getValue();  

            // Get the doctor ID and specialization type from the full name
            String[] parts = fullName.split(" ");  // Split based on spaces to get doctor ID and specialization type
            String doctorId = parts[1];  // Doctor ID will be the second part
            String specializationType = parts[2];  // Specialization type will be the third part (general/specialist)

            // Assign the cost based on specialization
            if (specializationType.contains("general")) {
                doctorCosts.put(doctorId, genCost);  // If general, assign general cost
            } else if (specializationType.contains("specialist")) {
                doctorCosts.put(doctorId, specCost);  // If specialist, assign specialist cost
            }
        }
        //System.out.println(doctorCosts);

        // for (Map.Entry<NumFluent, PDDLNumber> entry : typeCostFluent.entrySet()) {
        //     String fullName = entry.getKey().toString();  // Get full name (or use getName() if appropriate)
            
        //     if (fullName.contains("general")) {
        //         genCost = entry.getValue().getNumber().doubleValue();;
        //     } else if (fullName.contains("specialist")) {
        //         specCost = entry.getValue().getNumber().doubleValue();
        //     }
        // }        
        //System.out.println("gen cost: "+ genCost + "specCost: " + specCost);

    
        // System.out.println(problemBoolMap);

        // Map<BoolPredicate, Boolean> genAppointments = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("general_appointment")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        // System.out.println(genAppointments);
        // for (BoolPredicate i : genAppointments.keySet()){

        //     genAppointmentCost += genCost;
        // }

        // System.out.println(genAppointmentCost);

        // Map<BoolPredicate, Boolean> specAppointments = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("specialist_appointment")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        // System.out.println(specAppointments);
        // for (BoolPredicate i : specAppointments.keySet()){

        //     specAppointmentCost += specCost;
        // }
        // System.out.println(specAppointmentCost);

        // minCost = specAppointmentCost + genAppointmentCost;

        //More dynamic way to calculate remaining cost left - needs testing
        BitSet boolFluents = s.getBoolFluents();

        //System.out.println(boolFluents);

        Map<String, Double> patientCostMap = new HashMap<>();

        for (BoolPredicate pred : PDDLProblem.booleanFluents) {

          
            if (pred.getName().contains("scheduled")) {

                int index = pred.getId();
                boolean isScheduled = boolFluents.get(index); 
               
                //boolean isScheduled = s.holds(pred);

                if (!isScheduled) {

                    String[] parts = pred.toString().split(" ");
                    String patientId = parts[1];
                    String doctorId = parts[2];
        
                    double doctorCost = doctorCosts.get(doctorId);
        
                    //System.out.println("patient id" + patientId);
                   
                    //System.out.println("dr cost" + doctorCost);
                    
                    // If the patient already has a cost recorded, take the minimum between the current cost and the new cost
                    if (!patientCostMap.containsKey(patientId)) {
                        // Store the first cost for the patient if not already stored
                        patientCostMap.put(patientId, doctorCost);
                        //System.out.println("cost Map:" + patientCostMap);
                    } else {
                        // If already stored, update the cost to the minimum cost
                        double currentCost = patientCostMap.get(patientId);
                        patientCostMap.put(patientId, Math.min(currentCost, doctorCost));
                        //System.out.println("cost Map:" + patientCostMap);
                    }
                }
            }
        }
        System.out.println(patientCostMap);
        
        for (double cost : patientCostMap.values()) {
            System.out.println(cost);
           
            minCost += cost;  // Sum up the individual patient costs
        }
        System.out.println(minCost);
            
        return minCost;
    }

    public double getStateTotalDoctorCost(PDDLState s) {

        //System.out.println(s);

        // Look for the numeric fluent "total_doctor_cost"
        Map<NumFluent, PDDLNumber> problemMap = problem.getInitNumFluentsValues();

        //System.out.println(problemMap);
        NumFluent doctorCostFluent = problemMap.keySet().stream().filter(x -> x.getName().equals("total_doctor_cost")).findFirst().orElseThrow();
        //System.out.println("doctor cost fluent: "+ doctorCostFluent);

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
