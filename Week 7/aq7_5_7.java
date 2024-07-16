import java.util.*;
import java.util.logging.*;
public class aq7_5_7{
      private static final Logger logr = Logger.getLogger("Hello");
      public static void main(String[] args) {
           logr.info(logr.getName()+", create a generic ArrayList.");
           List<Integer> number=new ArrayList();
           for(int i=1;i<=3;i++){
                number.add(i);
           }
           logr.setLevel(Level.FINEST);
           logr.fine("An array list of Integer.");
           logr.warning("The index of element should be within bound.");
           try{
                System.out.println(number.get(3));
           }
           catch(IndexOutOfBoundsException e){
                 logr.severe("The warning was ignored!");
           }
      }
}