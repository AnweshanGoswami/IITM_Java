import java.util.*;

public class stack1 {

    public static void main(String[] args) {
        Stack<String> hello = new Stack<String>();
        String s = "Hello World";
for (int i = 0; i < s.length(); i++) {
            hello.push(s.substring(i, i+1));
        }
        int hs = hello.size();
        for (int i=0; i<hs; i++){
            System.out.println(hello.pop());
        }

System.out.println(hello.size());
System.out.println(s.length());
    }
    
}
