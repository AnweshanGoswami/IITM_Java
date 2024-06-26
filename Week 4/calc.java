abstract class Calculator{
    abstract int addition(int a,int b);
    abstract int subtraction(int a,int b);
    abstract int multiplication(int a,int b);
    abstract int division(int a,int b);
}
public class calc extends Calculator{
    public int addition(int c,int d){
          return c+d;
    }
    public int subtraction(int c,int d){
          return c-d;
    }
    public int division(int c,int d){
          return c/d;
    }
    //public int multiplication(int c,int d){  the program runs into an error because this child class doesn't follow the blueprint of the calculator class
      //return c*d;
}
    public static void main(String args[]){
          calc obj=new calc();
          System.out.println(obj.division(5,2));
    }
}