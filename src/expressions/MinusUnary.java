/**
 * *******************************************************************
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 ********************************************************************
 */
/**
 * *******************************************************************
 * Description: Part of the PPMaJaL library
 *
 * Author: Enrico Scala 2013
 * Contact: enricos83@gmail.com
 *
 ********************************************************************
 */
package expressions;

import conditions.Conditions;
import conditions.PDDLObject;
import domain.Variable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import problem.PDDLObjects;
import problem.RelState;
import problem.State;

/**
 *
 * @author enrico
 */
public class MinusUnary extends Expression {

    Expression element;

    public MinusUnary() {
        super();
    }

    public MinusUnary(Expression expr) {
        super();
        element = expr;
    }

    @Override
    public Expression ground(Map<Variable, PDDLObject> substitution, PDDLObjects po) {
        MinusUnary ret = new MinusUnary();

        ret.element = element.ground(substitution, po);
        ret.grounded = true;
        return ret;
    }

    @Override
    public Expression unGround(Map substitution) {
        MinusUnary ret = new MinusUnary();

        ret.element = element.unGround(substitution);
        ret.grounded = false;
        return ret;
    }

    @Override
    public PDDLNumber eval(State s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ExtendedNormExpression normalize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void changeVar(Map<Variable, PDDLObject> substitution) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Expression weakEval(State s, HashMap invF) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Expression clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Interval eval(RelState s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean involve(HashMap<NumFluent, Boolean> arrayList) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Expression subst(Conditions numeric) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set rhsFluents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isUngroundVersionOf(Expression expr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression susbtFluentsWithTheirInvariants(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression susbtFluentsWithTheirInvariants(HashMap<Object, Boolean> invariantFluent, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toSmtVariableString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean involve(NumFluent a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pddlPrint(boolean typeInformation, StringBuilder bui) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
