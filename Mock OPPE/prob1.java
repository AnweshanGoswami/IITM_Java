import java.util.*;
class Employee{
    String name;
    String[] projects; 
//***** Define constructor(s) here

//Normal constructor
public Employee(String n, String [] p){
    this.name = n;
    //projects is an array, remember to iniiaise it
    projects = new String[p.length];
    for(int i=0;i<p.length;i++){
        this.projects[i] = p[i];
    }
    }
    
//Copy constructor
public Employee(Employee e){
    this.name = e.name;
    int len = e.projects.length;
    projects = new String[len];
    for(int i=0;i<len;i++){
        this.projects[i] = e.projects[i];
    }
}

    public void setName(String n) {
        name = n;
    }
    public void setProject(int index, String proj) {
        projects[index] = proj;
    }
    public String getName() {
        return name;
    }
    public String getProject(int indx) {
        return projects[indx];
    }
}
public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] proj =  {"PJ1", "PJ2", "PJ3"};
        Employee e1 = new Employee("Surya", proj);
        Employee e2 = new Employee(e1);
        e2.setName(sc.next());
        e2.setProject(0, sc.next());
        System.out.println(e1.getName() + ": " + e1.getProject(0));
        System.out.println(e2.getName() + ": " + e2.getProject(0));
    }
}

/*Sample Input
 * Sneha PJ5
 * 
 * Expected output
 * Surya: PJ1
Sneha: PJ5
 */