import java.util.*;
// Define interface Appraisable
interface Appraisable{
    default void appraisal(Teacher t){
        t.setSalary(t.getSalary() + (t.getstuPassPer()/100)*5000);
    }
}
// Define interface SpecialAppraisable
interface SpecialAppraisable extends Appraisable{
    default void spAppraisal(Teacher t){
        t.setSalary(t.getSalary() + (t.getstuPassPer()/100)*10000);
    }
}
class Teacher implements SpecialAppraisable{
    private String name;
    private double salary;
    private double stuPassPer;
    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getstuPassPer() {
        return stuPassPer;
    }
    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }
    public void checkAndUpdateSalary() {
        if(stuPassPer >= 60 && stuPassPer < 75)
            appraisal(this);
        else if(stuPassPer >= 75 && stuPassPer <= 100)
            spAppraisal(this);
    }
}
public class prob2 {
     // Define method printUpdatedTeachList 
     public static void printUpdatedTeachList(Teacher [] tlist){
         for (Teacher teacher:tlist){
            teacher.checkAndUpdateSalary(); //we do not need to create objects
            //as elements in tlist are already objects of class teacher
         }
         for (Teacher teacher:tlist){
             System.out.println(teacher);
         }
         
     }
     
     
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Teacher tArr[] = new Teacher[3];
for (int i = 0; i < tArr.length; i++)
tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
prob2.printUpdatedTeachList(tArr);
}
}