import java.util.Scanner;
class Faculty{
   private String name;
   private double salary;
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
   // Define method getDetails()
   //In out main function, we can see how .getDetails() has been used
   // In order to print it, we have to return it as String
   // That too in the given format
   public String getDetails(){
       return name + ", " + salary;
   }
    // Override method getDetails(float percent)
    public String getDetails(float percent){
        return name + ", " + salary + ", bonus = " + bonus(percent);
        //Since bonus is a function inside this class, we do not have to create object
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getSalary(){
        return this.salary;
    }
}
class Hod extends Faculty{
    private String personalAssistant;
    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }
    // Override method bonus(float percent)
    public double bonus(float percent){
       return 0.5*super.bonus(percent);
   }
   
    // Override method getDetails()
    public String getDetails(){
       return super.getName() + ", " + super.getSalary() + ", " + personalAssistant;
    }
    // Override method getDetails(float percent)
    public String getDetails(float percent){
        return super.getName() +", " + super.getSalary() + ", " + personalAssistant + ", " + bonus(percent);
        //Since bonus is a function inside this class, we do not have to create object
    }
}
public class prob2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}