import java.util.*;
//Add your code for Class Student here
class Student{
    private String name; //name of Student
    double [] marks; //to store marks of 3 subjects
    
    //constructor
    public Student(String n, double m[]){
        this.name = n;
        marks = new double[3];
        for(int i=0;i<3;i++){
        marks[i] = m[i];
        }
    }
    
    //accessor method
    public String getName(){
        return (this.name);
    }
    
    //find total
    public double findTotal(){
        double total = 0.0;
        for(double mark:marks){
            total += mark;
        }
        return(total);
    }    
}
public class prob1{
    // Define the method getMax() here
    public static String getMax(Student l[]){
        String max_student = "No one";
        double max_total=-1.0;
        for(Student student:l){
            if ((student.findTotal()) > max_total){
                max_total = student.findTotal();
                max_student = student.getName();
            }
        }
        return(max_student);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];   
        for(int i = 0; i < 3; i++){
            String name = sc.next();
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));  
    }
}


/* Test cases

Input: Ram 67 78 90
Latha 72 79 89
Sonu 77 92 45
Output: Latha

Input: Rahul 23 45 67
Divya 34 48 69
Rohit 45 51 78
Output: Rohit
 */