import java.util.*;
class AQ5_3{
      public static void main(String[] args){
              ArrayList<String> list=new ArrayList<String>();
              list.add("Hello");
              list.add("Hola");
              list.add("Hey");
              //list.add("true"); //This works because this is a normal string
              //list.add(true); //This doesn't work because this is a boolean
              adding(list);
              System.out.println(list);
      }
    static void adding(ArrayList <String> l){
              l.add(false); //Now these additions dont work because it's not ageneric type anymore
              l.add(10);
      }
}