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

        //Get all num fluents from problem file
        Map<NumFluent, PDDLNumber> problemNumMap = problem.getInitNumFluentsValues();

        //Get all bool fluents from problem file
        Map<BoolPredicate, Boolean> problemBoolMap =  problem.getInitBoolFluentsValues();

     
        //filter for doctor_type_cost
        Map<NumFluent, PDDLNumber> typeCostFluent = problemNumMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("doctor_type_cost")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        //get cost values of general/ specialist types
        for (Map.Entry<NumFluent, PDDLNumber> entry : typeCostFluent.entrySet()) {
            String fullName = entry.getKey().toString();  
            
            if (fullName.contains("general")) {
                genCost = entry.getValue().getNumber().doubleValue();;
            } else if (fullName.contains("specialist")) {
                specCost = entry.getValue().getNumber().doubleValue();
            }
        }

        //filter for doctor specialisation type
        Map<BoolPredicate, Boolean> doctorType = problemBoolMap.entrySet().stream().filter(entry -> entry.getKey().getName().equals("specialises_in")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    

        Map<String, Double> doctorCosts = new HashMap<>();

        // iterate through the doctor specialisations and assign the corresponding costs
        for (Map.Entry<BoolPredicate, Boolean> entry : doctorType.entrySet()) {
            String fullName = entry.getKey().toString();  
            boolean isSpecialist = entry.getValue();  

            // get the doctor ID and specialization type from the full name
            String[] parts = fullName.split(" ");  // split  to get doctor ID and specialization type
            String doctorId = parts[1];  // store doctor ID
            String specialisationType = parts[2];  // store specialisation type 

            // assign the cost based on specialisation
            if (specialisationType.contains("general")) {
                doctorCosts.put(doctorId, genCost);  
            } else if (specialisationType.contains("specialist")) {
                doctorCosts.put(doctorId, specCost);  
            }
        }
        //System.out.println(doctorCosts);

        // for (Map.Entry<NumFluent, PDDLNumber> entry : typeCostFluent.entrySet()) {
        //     String fullName = entry.getKey().toString();  
            
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

        //More dynamic way to calculate future cost 
        BitSet boolFluents = s.getBoolFluents();


        Map<String, Double> patientCostMap = new HashMap<>();
        Set<String> alreadyScheduledPatients = new HashSet<>();

        for (BoolPredicate pred : PDDLProblem.booleanFluents) {

          
            if (pred.getName().contains("scheduled")) {

                int index = pred.getId();
                boolean isScheduled = boolFluents.get(index); 

                if (isScheduled) {
                    String[] parts = pred.toString().split(" ");
                    String patientId = parts[1];
                    alreadyScheduledPatients.add(patientId); //Store patients who are already scheduled
                }

                else{

                    String[] parts = pred.toString().split(" ");
                    String patientId = parts[1];
                    String doctorId = parts[2];
        
                    //ignore already scheduled patients
                    if (alreadyScheduledPatients.contains(patientId)) {
                        continue; 
                    }
                    
                    double doctorCost = doctorCosts.get(doctorId); //get cost of doctor
                    
                    patientCostMap.merge(patientId, doctorCost, Math::min);
                }
            }
        }
        System.out.println(patientCostMap);
        
        for (double cost : patientCostMap.values()) {
           
            minCost += cost;  // sum up the individual patient costs
        }
            
        return minCost;
    }

    //redundant function but kept for future uses
    public double getStateTotalDoctorCost(PDDLState s) {

        //store all num fluents from problem file 
        Map<NumFluent, PDDLNumber> problemMap = problem.getInitNumFluentsValues();

        // filter for total_doctor_cost          
        NumFluent doctorCostFluent = problemMap.keySet().stream().filter(x -> x.getName().equals("total_doctor_cost")).findFirst().orElseThrow();
      

        if (doctorCostFluent == null) {
            System.err.println("Error: Fluent 'total_doctor_cost' not found.");
            return 0.0;  // Return a default value
        }

        double fluentValue = s.fluentValue(doctorCostFluent); //get value of cost fluent in state

        if (Double.isNaN(fluentValue)) {
             System.err.println("Error: 'total_doctor_cost' is NaN in the current state.");
             return 0.0;  // Return a default value
         }

        // Return the fluent value
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
