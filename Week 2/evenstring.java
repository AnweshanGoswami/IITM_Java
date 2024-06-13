import java.util.Scanner;

public class evenstring 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter a string");
        //String s1 = in.nextLine();
        String s1 = "Anweshan";
        evenDisplay(s1); //object has not been created
    }
    
    
    //this function is non-static, it does not work with our code because an object is not created in main() during function call
    //void evenDisplay(String s)
    //{
        //for(int i=0; i<s.length(); i++)
        //{
            //char c;
            //if (i%2==0)
            //{
                //c = s.charAt(i);
                //System.out.print(c);
            //}
        //}
    //}

    static void evenDisplay(String s)
    {
        for(int i=0; i<s.length(); i++)
        {
            char c;
            if (i%2==0)
            {
                c = s.charAt(i);
                System.out.print(c);
            }
        }

    }
    
}
