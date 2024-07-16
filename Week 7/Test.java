import java.util.*;
//Define DivisionException class here
class DivisionException extends Exception{
    
    //This is not necessary, as we do not care what the Exception displays as message
    // We will be handling the exception, so thats all that matters
    //So we can create a constructor or not

    //lets create one to just see how it works
    //public void DivisionException(){} //empty, because no initialisation is required

    /* public DivisionException(String message){
         super(message);
    }
    */ 
    
    //However, it's good programmming practice to declare the constructor and throw a proper error

    public DivisionException(String message){
        super(message);
    }

    //We have to use this toString function becuse when we catch
    //this error in our main method, we also have to handle It
    //and to do that, we need to override the string function

    //We do actually need this line
    //We can just print the same statement when we encounter that specific error
    //But since the question asked us to do that specifically, we're gonna do it
    public String toString(){
    return "Division by 3 is not allowed";}
}

public class Test {
 
    //Define divide(int a, int b) here
    public int  divide(int a, int b) throws DivisionException{
        if (b == 3){
        throw new DivisionException("Division by 3 is not allowed");}
        else{
        return (a/b);}
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = 10;
       int y = 4;
       
       //call divide method here
       Test ob = new Test();
       try{
       System.out.println(ob.divide(x,y));
       }
       catch(DivisionException e){
       System.out.println(e.toString());
       }
       }}

