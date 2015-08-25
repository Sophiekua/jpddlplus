/**
 * *******************************************************************
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 ********************************************************************
 */
/**
 * *******************************************************************
 * Description: Part of the PPMaJaL library
 *
 * Author: Enrico Scala 2013 Contact: enricos83@gmail.com
 *
 ********************************************************************
 */
package conditions;

import expressions.NumFluent;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import problem.GroundAction;
import problem.RelState;
import problem.State;

/**
 *
 * @author enrico
 */
public class OrCond extends Conditions {

    public HashSet son;

    public OrCond() {
        super();
        sons = new LinkedHashSet();
    }

    public void addConditions(Conditions c) {
        sons.add(c);
    }

    public String toString() {
        String ret_val = "Or(";
        for (Object o : sons) {
            ret_val = ret_val.concat(o.toString());
        }
        ret_val = ret_val.concat(")");

        return ret_val;
    }

    @Override
    public void normalize() {
        Iterator it = sons.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            if (o instanceof Comparison) {
                Comparison comp = (Comparison) o;
                try {
//                    System.out.println(comp);
                    comp = comp.normalizeAndCopy();
                } catch (Exception ex) {
                    Logger.getLogger(OrCond.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (comp == null) {
                    it.remove();
                }
            } else if (o instanceof AndCond) {
                AndCond temp = (AndCond) o;
                temp.normalize();
            } else if (o instanceof NotCond) {
                NotCond temp = (NotCond) o;
                temp.normalize();
            } else if (o instanceof OrCond) {
                OrCond temp = (OrCond) o;
                temp.normalize();
            }
        }

    }

    @Override
    public Conditions ground(Map substitution) {
        OrCond ret = new OrCond();

        for (Object o : sons) {
            Conditions el = (Conditions) o;
            ret.sons.add(el.ground(substitution));
        }
        ret.grounded = true;
        return ret;
    }
    
    @Override
    public Conditions ground(Map substitution, int c) {
        Conditions ret = this.ground(substitution);
        ret.setCounter(c);
        return ret;
    }

    @Override
    public boolean eval(State s) {

        for (Object o : sons) {
            Conditions c = (Conditions) o;
            if (c.eval(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isSatisfied(State s) {
        for (Object o : sons) {
            Conditions c = (Conditions) o;
            if (c.isSatisfied(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isSatisfied(RelState s) {
        for (Object o : sons) {
            Conditions c = (Conditions) o;
            if (c.isSatisfied(s)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void changeVar(Map substitution) {

        for (Object o : sons) {
            Conditions el = (Conditions) o;
            el.changeVar(substitution);
        }
    }

    public String pddlPrint(boolean typeInformation) {
        String ret_val = "(or ";
        for (Object o : sons) {
            if (o instanceof Conditions) {
                Conditions c = (Conditions) o;
                ret_val = ret_val.concat(c.pddlPrint(typeInformation));
            } else if (o instanceof Comparison) {
                Comparison comp = (Comparison) o;
                ret_val = ret_val.concat(comp.pddlPrint(typeInformation));
            } else {
                System.out.println("Error in pddlPrint:" + this);
                System.exit(-1);
            }
        }
        ret_val = ret_val.concat(")");
        return ret_val;
    }

    @Override
    public Conditions clone() {
        OrCond ret = new OrCond();

//        ret.sons = new HashSet();
        ret.sons = (LinkedHashSet) this.sons.clone();
//        for(Object o: this.sons){
//            if (o instanceof AndCond){
//                AndCond a = (AndCond)o;
//                ret.sons.add(a.clone());
//            }else if(o instanceof NotCond){
//                NotCond a = (NotCond)o;
//                ret.sons.add(a.clone());
//            }else if(o instanceof OrCond){
//                OrCond a = (OrCond)o;
//                ret.sons.add(a.clone());
//            }else if(o instanceof Predicate){
//                Predicate a = (Predicate)o;
//                ret.sons.add(a.clone());            
//            }else if(o instanceof Comparison){
//                Comparison a = (Comparison)o;
//                ret.sons.add(a.clone());            
//            }else if(o instanceof Assigner){
//                Assigner a = (Assigner)o;
//                ret.sons.add(a.clone());            
//            }
//        }
        ret.grounded = this.grounded;
        return ret;
    }

    @Override
    public Conditions unGround(Map substitution) {
        OrCond ret = new OrCond();

        for (Object o : sons) {
            Conditions el = (Conditions) o;
            ret.sons.add(el.unGround(substitution));
        }
        ret.grounded = false;
        return ret;
    }

    @Override
    public boolean isUngroundVersionOf(Conditions conditions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toSmtVariableString(int i) {
        String ret = "";

        //System.out.println(this);
        if (this.sons != null) {
            if (this.sons.size() > 1) {
                ret += "(or";
            }
            for (Object o : this.sons) {
                if (o instanceof Predicate) {
                    Predicate p = (Predicate) o;
                    ret += " " + p.toSmtVariableString(i);
                } else if (o instanceof NotCond) {
                    NotCond nc = (NotCond) o;
                    ret += " " + nc.toSmtVariableString(i);
                } else if (o instanceof Conditions) {
                    //System.out.println(o.getClass());
                    Conditions c = (Conditions) o;
                    ret += " " + c.toSmtVariableString(i);
                } else {
                    System.err.println("Not Supported" + o.getClass());
                }
            }
            if (this.sons.size() > 1) {
                ret += ")";
            }
        }
        return ret;
    }

    @Override
    public Set<NumFluent> getInvolvedFluents() {
        Set<NumFluent> ret = new HashSet();

        //System.out.println("Testing with:"+this.sons);
        if (this.sons != null) {
            for (Object o : this.sons) {
//                System.out.println("Testing with:"+o);
                if (o instanceof NumFluent) {
                    ret.add((NumFluent) o);
                } else {
                    if (o instanceof Conditions) {

                        Conditions c = (Conditions) o;
                        //System.out.println(c);
                        if (c.getInvolvedFluents() != null) {
                            ret.addAll(c.getInvolvedFluents());
                        }
                    } else {
                        System.out.println("Error in getting involved fluents");
                    }
                }
            }
        }

        return ret;
    }

    public boolean involveReacheablePredicates(RelState possibleState) {

        if (this.sons != null) {
            for (Object o : this.sons) {
//                System.out.println("Testing with:"+o);
                if (o instanceof NotCond) {
                    NotCond nc = (NotCond) o;
                    if (nc.son.iterator().next() instanceof Predicate) {
                        Conditions p = (Conditions) nc.son.iterator().next();
                        if (possibleState.satisfy(p)) {
                            //System.out.println(p+" satisfiable");
                            return true;
                        } else {
                            //System.out.println(p);
                            return false;//System.out.println(";Predicate "+p+" is not possible");
                        }
                    }
                } else if (o instanceof Predicate) {
                    Predicate p = (Predicate) o;
                    if (possibleState.satisfy(p)) {
                        //System.out.println(p+" satisfiable");
                        return true;
                    } else {
                        //System.out.println(p);
                        return false;//System.out.println(";Predicate "+p+" is not possible");
                    }
                }
            }
        }
        return false;
    }
    public boolean involveReacheablePredicates(Collection<Predicate> possibleState) {

        if (this.sons != null) {
            for (Object o : this.sons) {
//                System.out.println("Testing with:"+o);
                if (o instanceof NotCond) {
                    NotCond nc = (NotCond) o;
                    if (nc.son.iterator().next() instanceof Predicate) {
                        Conditions p = (Conditions) nc.son.iterator().next();
                        if (possibleState.contains(p)) {
                            //System.out.println(p+" satisfiable");
                            return true;
                        } else {
                            //System.out.println(p);
                            return false;//System.out.println(";Predicate "+p+" is not possible");
                        }
                    }
                } else if (o instanceof Predicate) {
                    Predicate p = (Predicate) o;
                    if (possibleState.contains(p)) {
                        //System.out.println(p+" satisfiable");
                        return true;
                    } else {
                        //System.out.println(p);
                        return false;//System.out.println(";Predicate "+p+" is not possible");
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public Conditions weakEval(State s, HashMap invF) {
        if (this.sons != null) {
            for (Object o2 : this.sons) {
                if (o2 instanceof Conditions) {
                    Conditions c = (Conditions) o2;
                    c.setFreeVarSemantic(this.freeVarSemantic);
//                    System.out.println(c);
                    c = c.weakEval(s, invF);
//                    System.out.println(c);
                    if (c == null) {
                        return null;
                    }
                }
            }
        }
        return this;
    }

    @Override
    public String toSmtVariableString(int k, GroundAction gr, String var) {
        String ret = "";

        //System.out.println(this);
        if (this.sons != null) {
            if (this.sons.size() > 1) {
                ret += "(or";
            }
            for (Object o : this.sons) {
                if (o instanceof Predicate) {
                    Predicate p = (Predicate) o;
                    ret += " " + p.toSmtVariableString(k,gr,var);
                } else if (o instanceof NotCond) {
                    NotCond nc = (NotCond) o;
                    ret += " " + nc.toSmtVariableString(k,gr,var);
                } else if (o instanceof Conditions) {
                    //System.out.println(o.getClass());
                    Conditions c = (Conditions) o;
                    ret += " " + c.toSmtVariableString(k,gr,var);
                } else {
                    System.err.println("Not Supported" + o.getClass());
                }
            }
            if (this.sons.size() > 1) {
                ret += ")";
            }
        }
        return ret;
    }
}
