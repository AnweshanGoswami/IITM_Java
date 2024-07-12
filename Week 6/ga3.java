import java.util.*;

     public class ga3{
          public static void main(String[] args) {
                Map<Integer, Character> entries = new TreeMap<Integer, Character>();
                entries.put(30, 'b');
                entries.put(40, 'a');
                entries.put(20, 'd');
                entries.put(10, 'c');
                TreeSet<Character> values = new TreeSet<Character>(entries.values()); //Arranged on basis pf values
                //Collection <Character> values = entries.values(); //Arranged on basis of keys
                //PriorityQueue<Character> values = new PriorityQueue<Character>(entries.values()); //Also arranged on basis of values
                //LinkedList<Character> values = new LinkedList<Character>(entries.values()); //Arranged on basis of keys
                for(Character c : values)
                       System.out.print(c + " ");
          }
     }