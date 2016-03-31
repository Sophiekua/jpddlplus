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
package expressions;

/**
 *
 * @author Enrico Scala
 */
public class PDDLNumbers {

    public PDDLNumber inf;
    public PDDLNumber sup;
    public boolean is_not_a_number;

    public PDDLNumbers() {
        super();
        is_not_a_number = false;
        inf = new PDDLNumber();
        sup = new PDDLNumber();
    }

    public PDDLNumbers(Float i) {
        if (i.isNaN()) {
            is_not_a_number = true;
            inf = new PDDLNumber(Float.NaN);
            sup = new PDDLNumber(Float.NaN);
        }
        inf = new PDDLNumber(i);
        sup = new PDDLNumber(i);
    }
    
    public void set_open_interval(){
    
           inf.setNumber(Float.NEGATIVE_INFINITY);
           sup.setNumber(Float.POSITIVE_INFINITY);
    
    
    }
    public PDDLNumbers sum(PDDLNumbers b) {
        PDDLNumbers ret_val = new PDDLNumbers();
        if (this.is_not_a_number || b.is_not_a_number) {
            return new PDDLNumbers(Float.NaN);
        }
//        System.out.println(b);
//        System.out.println("Summing ("+this.inf+","+this.sup+")"+" with ("+b.inf+","+b.sup+")");
//        System.out.println("Before ("+this.inf+","+this.sup+")");
        if (b.inf.getNumber() == -Float.MIN_VALUE || b.inf.getNumber() == Float.MAX_VALUE) {
            ret_val.inf = new PDDLNumber(b.inf.getNumber());
        } else {
            ret_val.inf = new PDDLNumber(inf.getNumber() + b.inf.getNumber());
        }
        if (b.sup.getNumber() == -Float.MIN_VALUE || b.sup.getNumber() == Float.MAX_VALUE) {
            ret_val.sup = new PDDLNumber(b.sup.getNumber());
        } else {
            ret_val.sup = new PDDLNumber(sup.getNumber() + b.sup.getNumber());
        }
//        System.out.println("After ("+ret_val.inf+","+ret_val.sup+")");
        return ret_val;
    }

    public PDDLNumbers subtract(PDDLNumbers b) {
        PDDLNumbers ret_val = new PDDLNumbers();
        ret_val.inf = new PDDLNumber(inf.getNumber() - b.sup.getNumber());
        ret_val.sup = new PDDLNumber(sup.getNumber() - b.inf.getNumber());

        return ret_val;
    }

    public PDDLNumbers mult(Float a) {
        if (this.is_not_a_number) {
            return new PDDLNumbers(Float.NaN);
        }
        PDDLNumbers ret_val = new PDDLNumbers();

        if (a < 0) {
            ret_val.inf = new PDDLNumber(sup.getNumber() * a);
            ret_val.sup = new PDDLNumber(inf.getNumber() * a);

        } else {
            ret_val.inf = new PDDLNumber(inf.getNumber() * a);
            ret_val.sup = new PDDLNumber(sup.getNumber() * a);
        }

        return ret_val;
    }

    public PDDLNumbers mult(PDDLNumbers b) {
        PDDLNumbers ret_val = new PDDLNumbers();
        //System.out.println("Moltiplicazione: " + this.inf +" * "+b.inf);
        Float ac = inf.getNumber() * b.inf.getNumber();
        Float ad = inf.getNumber() * b.sup.getNumber();
        Float bc = sup.getNumber() * b.inf.getNumber();
        Float bd = sup.getNumber() * b.sup.getNumber();
        ret_val.inf = new PDDLNumber(Math.min(ac, Math.min(ad, Math.min(bc, bd))));
        ret_val.sup = new PDDLNumber(Math.max(ac, Math.max(ad, Math.max(bc, bd))));
        return ret_val;

    }

    
    public boolean contain_zero(){
        if (inf.getNumber()<= 0 && sup.getNumber()>=0){
            return true;
        }
        return false;
    }
    
    
    public PDDLNumbers div(PDDLNumbers b) {
        

        
        PDDLNumbers ret_val = new PDDLNumbers();
        if (b.contain_zero()){
            ret_val.set_open_interval();
        }else{
            Float ac = inf.getNumber() / new Float(b.inf.getNumber());
            Float ad = inf.getNumber() / b.sup.getNumber();
            Float bc = sup.getNumber() / b.inf.getNumber();
            Float bd = sup.getNumber() / b.sup.getNumber();
            ret_val.inf = new PDDLNumber(Math.min(ac, Math.min(ad, Math.min(bc, bd))));
            ret_val.sup = new PDDLNumber(Math.max(ac, Math.max(ad, Math.max(bc, bd))));
        }
        return ret_val;
    }

    public PDDLNumbers clone() {
        PDDLNumbers ret_val = new PDDLNumbers();

        ret_val.inf = new PDDLNumber(this.inf.getNumber());
        ret_val.sup = new PDDLNumber(this.sup.getNumber());
        return ret_val;

    }

    public PDDLNumbers sum(Float number) {
        PDDLNumbers ret_val = new PDDLNumbers();
        ret_val.inf = new PDDLNumber(this.inf.getNumber() + number);
        ret_val.sup = new PDDLNumber(this.sup.getNumber() + number);
        return ret_val;
    }

    public boolean can_be_negative() {
        return this.inf.less(0) || this.sup.less(0);//the second case should not happen
    }

    public boolean can_be_positive() {
        return this.inf.greater(0) || this.sup.greater(0);
    }

    PDDLNumbers pow(PDDLNumbers second) {
        PDDLNumbers ret = new PDDLNumbers();

        if (second.inf.getNumber() == 0.5f){//sqrt treatment
//            System.out.println("Debug");
            //both negative
            if (this.inf.getNumber() < 0 && this.sup.getNumber() < 0){
                ret.inf.setNumber(Float.NaN);
                return ret;
            }
            //the inf is negative
            if (this.inf.getNumber() < 0){
                ret.inf.setNumber(0.0f);
                ret.sup.setNumber(new Float(Math.pow(this.sup.getNumber(), second.inf.getNumber())));
                return ret;
            }
            //both positive
            ret.inf.setNumber(new Float(Math.pow(this.inf.getNumber(), second.inf.getNumber())));
            ret.sup.setNumber(new Float(Math.pow(this.sup.getNumber(), second.inf.getNumber())));
            return ret;
            
        }else{//higher integral powers
            if (this.inf.getNumber() >= 0 || (second.inf.getNumber() % 2 == 0)) {
//            if (this.inf.getNumber() >= 0 ) {

//                System.out.println("debug");
                ret.inf.setNumber((float) Math.pow(this.inf.getNumber(), second.inf.getNumber()));
                ret.sup.setNumber((float) Math.pow(this.sup.getNumber(), second.inf.getNumber()));
            } else if (this.sup.getNumber() < 0 ) {
                ret.inf.setNumber((float) Math.pow(this.sup.getNumber(), second.inf.getNumber()));
                ret.sup.setNumber((float) Math.pow(this.inf.getNumber(), second.inf.getNumber()));
            } else {
                ret.inf.setNumber(0.0f);
                ret.sup.setNumber(Math.max((float) Math.pow(this.inf.getNumber(), second.inf.getNumber()), (float) Math.pow(this.sup.getNumber(), second.inf.getNumber())));
            }
            return ret;
        }
        //the rest down here is deprecated
//        Float a = new Float(Math.pow(this.inf.getNumber(), second.inf.getNumber()));
//        Float b =  new Float(Math.pow(this.sup.getNumber(), second.inf.getNumber()));
//        
//        //very conservative enclosure
//        if (a.isNaN() || b.isNaN()){
//            ret.set_open_interval();
//            return ret;
//        }
//        
//        if (a.isNaN()){
//            a = this.inf.getNumber();
//        }
//        if (b.isNaN()){
//            b = this.sup.getNumber();
//        }
//        ret.inf.setNumber(new Float(Math.min(a, b)));
//        ret.sup.setNumber(new Float(Math.max(a, b)));
//        return ret;
    }
    
    @Override
    public String toString(){
        return "("+this.inf+","+this.sup+")";
    }
}
