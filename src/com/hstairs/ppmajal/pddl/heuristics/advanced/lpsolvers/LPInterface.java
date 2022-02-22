/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hstairs.ppmajal.pddl.heuristics.advanced.lpsolvers;

import com.hstairs.ppmajal.pddl.heuristics.advanced.H1;
import com.hstairs.ppmajal.pddl.heuristics.advanced.LM;
import com.hstairs.ppmajal.problem.State;
import it.unimi.dsi.fastutil.ints.IntSet;

/**
 *
 * @author enrico
 */
abstract public class LPInterface {

    protected final H1 h;
    public LPInterface(H1 h){
        this.h = h;
    }
    abstract public float solve(State s, IntSet lms);
}
