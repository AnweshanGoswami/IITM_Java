import java.util.*;
class Employee implements Comparable{
     private String name;
     private double salary;
     public Employee(String name, double salary) {
               this.name = name;
               this.salary = salary;
     }
     public String toString() {
              return "[" + name + " : " + salary + "]";
     }
     public int compareTo(Object e) {
             Employee d = (Employee)e;
             if(salary == d.salary)
                  return name.compareTo(d.name);
             else {
                  if (d.salary > salary)
                       return 1;
                  else if(d.salary < salary)
                       return -1;
                  else
                       return 0;
            }
     }
}
public class ga5{
       public static void main(String[] args) {
             TreeSet<Employee> empList = new TreeSet<Employee>();
             empList.add(new Employee("raj", 30000.00));
             empList.add(new Employee("akash", 60000.00));
             empList.add(new Employee("biraj", 60000.00));
             empList.add(new Employee("vinay", 40000.00));
             for(Employee e : empList)
             System.out.println(e);

             //internally, the comparable function decides the order in TreeSet.
             //Here, its doing descending order because of that
       }
  }