/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristics.advanced;

import conditions.Comparison;
import conditions.ComplexCondition;
import expressions.Expression;
import expressions.ExtendedNormExpression;
import expressions.Interval;
import expressions.NumEffect;
import expressions.PDDLNumber;
import heuristics.Aibr;
import heuristics.Heuristic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import PDDLProblem.PDDLGroundAction;
import PDDLProblem.GroundProcess;
import PDDLProblem.RelState;
import PDDLProblem.PDDLState;
import PDDLProblem.Metric;

/**
 *
 * @author dxli
 */
public class habs_add extends Heuristic {

    private static final Integer heuristic_type = 1; // may use heuristics other than h1.
    private static final Boolean cost_sensitive = false; // this is really "metric-sensitive".
    public Metric metric = null;
  
    private final Set<GroundProcess> processSet;
    private final Integer numOfSubdomains = 2;
    private h1 habs;

    public habs_add(ComplexCondition G, Set<PDDLGroundAction> A, Set<GroundProcess> P) {
        super(G, A, P);

        this.supporters = new LinkedHashSet<>();
        this.processSet = P;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }
  
    @Override
    public Float setup(PDDLState s) {
        // reachablity analysis by AIBR
        Float ret = aibrReachabilityAnalysis(s);
        if (ret == Float.MAX_VALUE) {
            // not reachable!
            return ret;
        }
        
        try {
            // abstraction step
            generate_subactions(s);
        } catch (Exception ex) {
            // non-linear effects not supported
            Logger.getLogger(habs_add.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // estimation for initial state
        setup_habs(s);
        ret = habs.compute_estimate(s);
        
        return ret;
    }

    private Float aibrReachabilityAnalysis(PDDLState s) {
        // reachability analysis on original problem using AIBR.
        Aibr first_reachH = new Aibr(this.G, this.A, this.processSet);
        first_reachH.setup(s);
        first_reachH.set(true, true);
        Float ret = first_reachH.compute_estimate(s);
        A = first_reachH.reachable;
        reachable = first_reachH.reachable;

        return ret;
    }
    
        
    /**
     * <p>
     * Generates subactions, and adds them to this.supporters.
     * 
     * @param s_0 the initial state. Currently only statically generate subactions before
     * the search started. In the future, may understand how to do this online.
     * @return null
     * @throws Exception does not support non-linear effect right now.
     * <p>
     */
    private void generate_subactions(PDDLState s_0) throws Exception {
        RelState rs = getRelaxedGoal(A, G, processSet, s_0);
        NumEffect effectOnCost = null;

        System.out.println("Generating subactions.");
        
        // a holder for constant numeric effects
        ArrayList<NumEffect> allConstantEffects = new ArrayList();

        for (PDDLGroundAction gr : reachable) {
            allConstantEffects.clear();
            
            if (gr.getNumericEffects() != null && !gr.getNumericEffects().sons.isEmpty()) {
                for (NumEffect effect : (Collection<NumEffect>) gr.getNumericEffects().sons) {
                    if (effect.getFluentAffected().getName().equals("total-cost") && cost_sensitive) {
                        effectOnCost = (NumEffect) effect.clone();
                        continue;
                    }
                    
                    ExtendedNormExpression rhs = (ExtendedNormExpression) effect.getRight();
                    // this is assuming no non-linear effects at the moment.
                    if (!rhs.rhsFluents().isEmpty() && rhs.linear) {
                        addPiecewiseSubactions(gr.toFileCompliant() + " " + effect.getFluentAffected(), gr, effect, effectOnCost, rs, s_0);
                    } else if (!rhs.linear){
                        throw new Exception("Non-linear effects not supported!");
                    } else { // constant numeric effects
                        allConstantEffects.add(effect);
                    }
                }
            }
            
            // aggregate constant numeric effects and propositional effects into one "constant subaction".
            if (!allConstantEffects.isEmpty() 
                    || (gr.getAddList() != null && !gr.getAddList().sons.isEmpty()) 
                    || (gr.getDelList() != null && !gr.getDelList().sons.isEmpty())) {
                addConstantSubaction(gr.toFileCompliant() + " const", gr, allConstantEffects, effectOnCost, s_0);
            }
        }

        System.out.println("Generating subactions finished.");
        System.out.println("|Sup + goal|: " + supporters.size());
    }

    private RelState getRelaxedGoal(Set<PDDLGroundAction> A, ComplexCondition G, Set<GroundProcess> P, PDDLState s) {
        Aibr aibr_handle = new Aibr(G, A, P);
        //aibr_handle
        aibr_handle.setup(s);
        return aibr_handle.get_reachable_state(s, s.relaxState());
    }

    /**
     * Setup habs without reachability analysis.
     *
     * @param s
     */
    public void setup_habs(PDDLState s) {
        habs = (h1) habsFactory(heuristic_type, G, (Set<PDDLGroundAction>) this.supporters, processSet);
        habs.light_setup(s);
    }

    private static Heuristic habsFactory(Integer heuristicType, ComplexCondition G, Set<PDDLGroundAction> A, Set<GroundProcess> P) {
        switch (heuristicType) {
            case (1): {
                return new h1(G, A, P);
            }
            default:
                return null;
        }
    }

    /**
     * <p>
     * Generates piecewise subactions for NON-CONSTANT LINEAR effects, and adds subactions 
     * to this.supporters.
     * 
     * @param name a sting used for naming the subaction, is the concatenation of action name and effect lhs name.
     * @param gr the action
     * @param effect the effect to be decomposed
     * @param effectOnCost the effect on metric
     * @param rs relaxed goal state from AIBR
     * @param s0 initial state in the original problem, used for setting metric.
     * @return null
     * @throws Exception does not support non-linear effect right now.
     * <p>
     */
    private void addPiecewiseSubactions(String name, PDDLGroundAction gr, NumEffect effect, NumEffect effectOnCost, RelState rs, PDDLState s_0) {
        // decomposition
        HashSet<Interval> subdomains = decomposeRhs(effect, rs);
        
        Expression repSample;
        String subactionName;
        Float domain_inf = Float.MAX_VALUE;
        Float domain_sup = - Float.MAX_VALUE;

        for (Interval subdomain : subdomains) {
            Float inf = subdomain.getInf().getNumber();
            Float sup = subdomain.getSup().getNumber();
            
            if (inf < domain_inf){
                domain_inf = inf;
            }
            if (sup > domain_sup){
                domain_sup = sup;
            }
            
            if (inf * sup >= 0){
                repSample = new ExtendedNormExpression((inf + sup) / 2);
                subactionName = name + " (" + inf.toString() + ',' + sup.toString() + ") ";// + effect.getFluentAffected().toString();
                PDDLGroundAction subaction = generatePiecewiseSubaction(subactionName, 
                        repSample, 
                        inf, 
                        sup, 
                        effect, 
                        effectOnCost, 
                        gr,
                        s_0);
                
                supporters.add(subaction);
                
            } else if (inf * sup < 0){ // theorem 2, ensuring asymptotic reachability
                repSample = new ExtendedNormExpression(sup/2);
                subactionName = name + " (0," + sup.toString() + ") "; // + " for " + effect.getFluentAffected().toString();
                PDDLGroundAction subaction = generatePiecewiseSubaction(subactionName, 
                        repSample, 
                        0f, 
                        sup, 
                        effect, 
                        effectOnCost, 
                        gr,
                        s_0);
                supporters.add(subaction);
                
                repSample = new ExtendedNormExpression(inf/2);
                subactionName = name + " (" + inf.toString() + ",0) ";// + " for " + effect.getFluentAffected().toString();
                subaction = generatePiecewiseSubaction(subactionName, 
                        repSample, 
                        inf, 
                        0f, 
                        effect, 
                        effectOnCost,
                        gr,
                        s_0);
                supporters.add(subaction);
            }
        }
        
        // add plus infinity subdomain
        if (domain_sup != 0){
            repSample = new ExtendedNormExpression(domain_sup);
        } else {
            // this is very unstable!!
            repSample = new ExtendedNormExpression(1f);
        }
        subactionName = name + " (" + domain_sup.toString() + ",+inf) ";// + " for " + effect.getFluentAffected().toString();
        PDDLGroundAction subaction = generatePiecewiseSubaction(subactionName, 
                repSample,  
                domain_sup,
                Float.MAX_VALUE,
                effect, 
                effectOnCost, 
                gr,
                s_0);
        supporters.add(subaction);
        
        // add minus infinity subdomain
        if (domain_inf != 0){
            repSample = new ExtendedNormExpression(domain_inf);
        } else {
            // this is very unstable!!
            repSample = new ExtendedNormExpression(-1f);
        }
        subactionName = name + " (-inf," + domain_inf.toString() + ") ";// + " for " + effect.getFluentAffected().toString();
        subaction = generatePiecewiseSubaction(subactionName, 
                repSample, 
                -Float.MAX_VALUE,
                domain_inf, 
                effect,
                effectOnCost, 
                gr,
                s_0);
        supporters.add(subaction);
        
    }
    
    private HashSet<Interval> decomposeRhs(NumEffect effect, RelState rs) {
        Interval rhsInterval = effect.getRight().eval(rs);
        
        Float inf, sup, strip;
        HashSet<Interval> subdomains = new HashSet<>();

        inf = rhsInterval.getInf().getNumber();
        sup = rhsInterval.getSup().getNumber();
        
        // uniform decomposition
        strip = (sup - inf) / numOfSubdomains;
        for (int i = 0; i < numOfSubdomains; i++) {
            Interval subdomain = new Interval();
            subdomain.setInf(new PDDLNumber(inf + strip * i));
            subdomain.setSup(new PDDLNumber(inf + strip * (i + 1)));
            
            subdomains.add(subdomain);
        }
        
        return subdomains;
    }

    private PDDLGroundAction generatePiecewiseSubaction(String subactionName, Expression repSample, Float inf, Float sup, NumEffect effect, NumEffect effectOnCost, PDDLGroundAction gr, PDDLState s_0) {    
        PDDLGroundAction subaction = new PDDLGroundAction(subactionName);

        // set up effect
        NumEffect supEff = new NumEffect(effect.getOperator());
        supEff.setFluentAffected(effect.getFluentAffected());
        supEff.setRight(repSample);

        // set effects for subactions
        subaction.getNumericEffects().sons.add(supEff);
        
        if (cost_sensitive && effectOnCost != null) {
            subaction.getNumericEffects().sons.add(effectOnCost);
            subaction.setAction_cost(s_0, this.metric);
        } else {
        // if not metric sensitive, set uniform action cost
            subaction.setAction_cost(1);
        }

        // setup preconditions. Preconditions = (indirect_preconditions) U pre(gr)
        Comparison indirect_precondition_gt;
        Comparison indirect_precondition_lt;
        
        if (inf < 0){
            indirect_precondition_gt = new Comparison(">=");
            indirect_precondition_lt = new Comparison("<");
        } else {
            indirect_precondition_gt = new Comparison(">");
            indirect_precondition_lt = new Comparison("<=");
        }
        
        indirect_precondition_gt.setRight(new PDDLNumber(inf));
        indirect_precondition_lt.setRight(new PDDLNumber(sup));
        indirect_precondition_gt.setLeft(effect.getRight());
        indirect_precondition_lt.setLeft(effect.getRight());

        indirect_precondition_gt.normalize();
        indirect_precondition_lt.normalize();

        // set pre-conditions for subactions
        subaction.getPreconditions().sons.add(indirect_precondition_lt);
        subaction.getPreconditions().sons.add(indirect_precondition_gt);
        subaction.setPreconditions(subaction.getPreconditions().and(gr.getPreconditions()));
        
        return subaction;
    }

    /**
     * <p>
     *
     * @param effect constant effect to generate supporters for.
     * @param name a string to distinguish between effects.
     * @param gr the grounded action.
     */
    private void addConstantSubaction(String name, PDDLGroundAction gr, ArrayList<NumEffect> allConstantEffects, NumEffect effectOnCost, PDDLState s_0) {
        PDDLGroundAction sup = new PDDLGroundAction(name);

        // add preconditions
        sup.setPreconditions(gr.getPreconditions());

        // add constant numeric effect
        for (NumEffect effect : allConstantEffects) {
            sup.getNumericEffects().sons.add(effect);
        }
        
        // add propositional effects
        sup.setAddList(gr.getAddList());
        sup.setDelList(gr.getDelList());
        
        // add effect on metric
        if (cost_sensitive && effectOnCost != null) {
            sup.getNumericEffects().sons.add(effectOnCost);
            sup.setAction_cost(s_0, metric);
        } else {
        // if not metric sensitive, set uniform action cost
            sup.setAction_cost(1);
        }
        
        supporters.add(sup);
    }

    @Override
    public Float compute_estimate(PDDLState s) {
        Float ret = habs.compute_estimate(s);
        
        return ret;
    }
}
