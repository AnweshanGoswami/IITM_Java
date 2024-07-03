import java.util.*;

class ComplexNum<T extends Number> {
    T r; // real part
    T i; // imaginary part

    // Constructor to initialize the instance variables
    ComplexNum(T r, T i) {
        this.r = r;
        this.i = i;
    }

    // Method to add two complex numbers
    public ComplexNum<Double> add(ComplexNum<? extends Number> x) { //matlab return datatype of complxNum,Double>
        //because answer must be in decimal, so double
        double realSum = this.r.doubleValue() + x.r.doubleValue();
        double imagSum = this.i.doubleValue() + x.i.doubleValue();
        return new ComplexNum<Double>(realSum, imagSum);
    }

    @Override
    public String toString() {
        return r.doubleValue() + " + " + i.doubleValue() + "i";
    }
}

public class ankit {
    public static void main(String[] args) {
        // Read user inputs using Scanner
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        double d1,d2;
        n1 = 10;
        n2 = 20;
        d1 = 13.3;
        d2 = 5.12;

        // Create instances of ComplexNum
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        
        // Add the complex numbers
        ComplexNum<Double> c3 = c1.add(c2);
        
        // Print the result
        System.out.println(c1 + " + " + c2 + " = " + c3);

        sc.close();
    }
}