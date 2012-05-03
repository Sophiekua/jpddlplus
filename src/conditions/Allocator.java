/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions;

import expressions.Expression;
import expressions.Function;
import java.util.Map;

/**
 *
 * @author enrico
 */
public class Allocator extends Conditions {
    private String operator;
    private Function one;
    private Expression two;
    public Allocator(String operator){
        super();
        this.operator = operator;
    }
    public String toString(){
    
        return "(" +getOperator()+" "+ getOne() + " " + getTwo() +")";
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the one
     */
    public Function getOne() {
        return one;
    }

    /**
     * @param one the one to set
     */
    public void setOne(Function one) {
        this.one = one;
    }

    /**
     * @return the two
     */
    public Expression getTwo() {
        return two;
    }

    /**
     * @param two the two to set
     */
    public void setTwo(Expression two) {
        this.two = two;
    }

    @Override
    public Conditions ground(Map substitution) {
        Allocator ret = new Allocator(this.operator);
        ret.one = (Function)this.one.ground(substitution);
        ret.two = this.two.ground(substitution);
        ret.grounded=true;
        return ret;
    }
    
}
