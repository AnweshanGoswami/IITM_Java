import java.util.Scanner;
class Faculty{

   //PLease note that these are private variables and therefore, we need accessor methods 
   //Which the question hasn't explicity asked to do
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
    public String getDetails(){
        return name+ ", "+ salary;
        //this automatically converts it to string because the function return type is such
    }
   
    // Override method getDetails(float percent)
    public String getDetails(float percent){
        return name+ ", "+ salary+", bonus = "+ bonus(percent);
        //this automatically converts it to string because the function return type is such
    }
    
    //accessor method
    public String getName(){
        return this.name;
    }
    
    public double getSalary(){
        return this.salary;
    }
}
class Hod extends Faculty{
    private String personalAssistant;
    
    //we have to access these from the parent class and then use super constuctor to initialise the HOD
    private String name = super.getName();
    private double salary = super.getSalary();
    
    public Hod(String name, double salary, String pa) {
        super(name, salary); //this wnt be enough, because private variables are not visible to subclasses 
        this.personalAssistant = pa;
    }
    // Override method bonus(float percent)
    public double bonus(float percent){
       return 0.5*super.bonus(percent);
   }
    // Override method getDetails()
    public String getDetails(){
        return name+ ", " + salary + ", " + personalAssistant;
    }
    // Override method getDetails(float percent)
    public String getDetails(float percent){
        return name+ ", "+ salary+ ", "+ personalAssistant+ ", "+ bonus(percent);
    }
    

}
public class prob1{
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

/*
 * Input Srihari 50000
Vishnu 80000 laxmi

Output Srihari, 50000.0
Srihari, 50000.0, bonus = 5000.0
Vishnu, 80000.0, laxmi
Vishnu, 80000.0, laxmi, 4000.0
 */