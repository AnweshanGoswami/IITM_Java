public class ga9{
    public static void main(String[] args) {
        int a=10,b=0;
        try{
             int c=a/b;
             System.out.println("Quotient is "+c);
        }
        catch (ArithmeticException e){
             System.out.println(10/0); // this line causes an exception again, and therefore there is a compilation error
             System.out.println("b value should not be zero");
        }
        catch (Exception e){
             System.out.println("Exception handled");
        }
    }
}