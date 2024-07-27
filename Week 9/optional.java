import java.util.*;
import java.util.stream.Stream;

public class optional {
    public static void main(String[] args) {
        ArrayList<Integer> intarr = new ArrayList<Integer>();
        intarr.add(1);
        intarr.add(2);
        intarr.add(3);
        intarr.add(4);
        intarr.add(5);

        Stream <Integer> intstream = intarr.stream();
        intstream.forEach(System.out::println);

        Stream <Integer> intstream5 = intarr.stream().filter(n -> n>5);
        //intstream5.forEach(s -> System.out.println(s));
        Optional<Integer> maxint = intstream5.findFirst();

        Integer fixmaxint = maxint.orElse(100);
        System.out.println(fixmaxint);

        Integer fixmaxint1 =maxint.orElseGet(() -> (int)(Math.random()*100));
        System.out.println(fixmaxint1);

         System.out.println(maxint.orElseThrow(IllegalStateException::new));
    }
    
}
