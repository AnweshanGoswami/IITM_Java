public class ga5 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
             int c=a/b;
             System.out.println("Quotient is "+c);
        }
        catch (Exception ae){
             System.out.println("Exception handled");
        }
        catch (ArithmeticException ae){ //compilation error because exception has already been handled
              System.out.println("ArithmeticException handled");
        }
   }
}