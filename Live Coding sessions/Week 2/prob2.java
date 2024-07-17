import java.util.*;
class Employee{
    String name;
    String[] projects;
//***** Define constructor(s) here
public Employee(String n, String p[]){
    this.name = n;
    projects = new String[p.length];
    for(int i=0;i<p.length;i++){
        projects[i] = p[i];
    }
}

//we also have to define a copy constructor based on the code implementaion
public Employee(Employee e){
    this.name = e.name;
    int len = e.projects.length;
    projects = new String[len];
    
    for(int j=0;j<len;j++){
        projects[j] = e.projects[j];
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
public class prob2 {
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

/* Input: Surya: PJ1
Sneha: PJ5

Output: Surya: PJ1\n
Sneha: PJ5\n


*/