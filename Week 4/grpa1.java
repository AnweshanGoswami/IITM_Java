import java.util.*;
abstract class StringOperations{
  public abstract String reverse(String s);
  public abstract int vowelCount(String s);
}
//Fill the code here

abstract class StringReverse extends StringOperations{
    public String reverse(String s){
        char x; //extract last characters
        String reversed = ""; //add the characters
        for(int i=0;i<s.length();i++){
            x  = s.charAt(i);
            reversed = x + reversed;
        }
        return(reversed);
    }
    
}

 class UpdatedStrings extends StringReverse{
    public int vowelCount(String s){
        int count=0;
        char x;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            x = s.charAt(i);
            if(x =='a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                count += 1;
            }
        }
        return(count);
    }
}
class Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    UpdatedStrings str = new UpdatedStrings();
    System.out.println("Reverse of "+ s + " is "+ str.reverse(s));
    System.out.println("Vowel count of "+ s + " is "+ str.vowelCount(s));
  }
}