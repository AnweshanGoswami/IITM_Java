// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
// A student has a name and an array containing marks in 3 subjects
class Student{
    String name; //making it private wwould be better, but this is okay too
    //double marks;
    double [] marks; //array of doubles
    //public Student( String n,double m){
    public Student(String n, double [] m){ //array of doubles is passed
        name=n;
        //marks=m;
        marks = new double[m.length];//initialise marks array with length same as that of the array passed in the function
        for(int i=0;i<m.length;i++){
            marks[i] = m[i];//we have to copy each element like this
        }
    }
    public String getName(){
        return name;
    }
    public double findTotal(){
        double total=0; // 0 is integer, 0.0 is double
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        return total;
    }
}

public class Test1{
    //public static String getMax(Student  a){
    public static String getMax(Student []a ){ //have to pass student array, not just a student
        double max=0; // 0 is integer, 0.0 is double
        String st=""; // "" are valid, “” are not
        for(Student s1:a){
            if(s1.findTotal()>max){
                max=s1.findTotal();
                st=s1.getName();
            }
        }
    return st;
    }
//} this bracet closes the class Test prematurely 
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        //Student arr = new Student[3];
        Student [] arr = new Student[3]; // You should declare an array on the LHS too
        for(int i = 0; i < 3; i++){
            System.out.println("Enter name of student " + (i + 1) + ":"); //added for user ease
            String name = sc.next();
            System.out.println("Enter the 3 marks one by one, followed by 1 space");
            //double m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            double [] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()}; //it's an array storing marks. You have to declare it to be an array
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));
    }
}

