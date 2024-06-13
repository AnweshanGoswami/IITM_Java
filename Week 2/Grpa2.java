import java.util.Scanner;

public class Grpa2 
{
    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        //String name = s.nextLine();
                String name = "Anweshan";
		
		        //Enter id of the employee
		        //String id = s.nextLine();
                String id = "IITM2021";
		
		        //Enter department of the employee
		        //String dept = s.nextLine();
                String dept = "Statistics";
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
    
}

class Employee
{
    String ename;
	    String eid;
	    String edept;
	    
	    public Employee(){
		        ename = "guest";
	    }

        Employee(String x, String y, String z)
        {
            ename = x;
            eid = y;
            edept = z;
        }
        
        void copyDept(Employee x)
        {
            edept = x.edept;
        }
        
        void displayDetails()
        {
            System.out.println("ename : " + ename);
            System.out.println("eid : " + eid);
            System.out.println("edept : "+ edept);
        }

}
