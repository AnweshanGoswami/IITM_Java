public class aq7_2_20{
    public static void main(String args[]) {
        try {
             throw new NullPointerException ("Hello");
        }
        catch(ArithmeticException e){
             System.out.print("B");
        }
    }
}
