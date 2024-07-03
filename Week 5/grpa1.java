//import java.util.*;
//Add your code for ComplexNum here
class ComplexNum <T extends Number>{ //extends Number to make sure that chaarcters and boolean are not inserted
    T r; //real part of Number
    T i; //complex part of Number
    
    //Constructor to initialise the instance variables
    ComplexNum(T r, T i){
        this.r = r;
        this.i = i;
    }
    
    /* public ComplexNum <Number> add(ComplexNum <Number> x){ 
        //A new ComplexNum to store the sum
        ComplexNum<Double> s = new ComplexNum<Double>(0.0, 0.0); //using double here because we need to be able to add and store numbers as double
        s.r = this.r +  x.r;
        s.i =  this.i +  x.i;
                return(s);
    }
     public String toString() {
        return r + " + " + i + "i";
    } */ 

    public ComplexNum <T> add(ComplexNum <T> x){ 
        T r = this.r.doubleValue() + x.r.doubleValue();
        T i = this.i.doubleValue() + x.i.doubleValue();
        return new ComplexNum<T>(r, i);
    }
public class grpa1{
public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = 10;
        n2 = 20;
        d1 = 13.3;
        d2 = 5.12;
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}}