public class dog
{
    //class variables
    String name;
    int age;

    //constructor
    dog(String n, int a) //same as class name, no return type
    {
        name = n;
        a = age;
    }

    //method
    void bark()
    {
        System.out.println(name + "  says woof");
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter a name for your dog");
        //String name = in.nextLine();
        //System.out.println("Enter your dog's age");
        //int age = in.nextInt();
        dog ob = new dog("pluto", 3);
        //ob.name = "pluto";
        //ob.age = 3;
        ob.bark();


    }


    
}
