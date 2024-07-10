import java.util.*;

public class stack2 {
    public static void main(String[] args) {
        Stack<String> word = new Stack<String>();
        Stack<String> front = new Stack<String>();
        Stack<String> back = new Stack<String>();

        String hello = "()()[(){()}]";

        for (int i = 0; i < hello.length(); i++) {
            if (hello.charAt(i) == '(' || hello.charAt(i) == '{' || hello.charAt(i) == '[' )
            front.push(hello.substring(i, i+1));
            else if (hello.charAt(i) == ')' || hello.charAt(i) == '}' || hello.charAt(i)==']')
            back.push(hello.substring(i, i+1));
            
        }

        for(String x:front)
        System.out.print(x);
        System.out.println("");
        for(String y:back)
        System.out.print(y);

}}
