import java.util.*;
//Add your code for Class Point here
class Point <T extends Number>{
    //here we use T because we know the following operations are going to because
    //involving those datatypes
    T x,y; //instance variables
    
    //constructor
    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }
    
    //Here, return type needs to be Point<Double>
    //In function arguments, we have to use ? becausw we don't know if it will be
    //sam as T. It can be any Number
    public Point<Double> mid(Point<? extends Number> P){
        double m,n;//need to be stored as double
        
        //Make sure to convert to doubleValue
        m = (x.doubleValue() + P.x.doubleValue())/2;
        n = (y.doubleValue() + P.y.doubleValue())/2;
        return(new Point<Double>(m,n));
    }
    
    public String toString(){
        return "(" + this.x.doubleValue() + "," + this.y.doubleValue() + ")";
    }
}
public class prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point<Integer> p1 = new Point<Integer>(sc.nextInt(), sc.nextInt());
        Point<Double> p2 = new Point<Double>(sc.nextDouble(), sc.nextDouble());
        Point<Double> p3 = p1.mid(p2);
        System.out.println(p3);        
    }
}

/* Sample input 2 3
2.2 4.2

Expected output (2.1,3.6)*/