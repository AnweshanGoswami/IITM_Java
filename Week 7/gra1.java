import java.util.logging.*;

class SomeClass {
      public void logIt(){
            Logger.getGlobal().info("First message");
      }
}

public class gra1 {
      public static void main(String[] args){
            SomeClass obj = new SomeClass();
            obj.logIt();
            Logger.getGlobal().setLevel(Level.FINEST); // even now this line doesnt seem to have any effect on the code
            Logger.getGlobal().log(Level.FINE, "second message");
            Logger.getGlobal().setLevel(Level.OFF);
            try {
                 throw new ArithmeticException();
            }
            catch(Exception e) {
                  Logger.getGlobal().log(Level.SEVERE, "third message");
            }
      }
}