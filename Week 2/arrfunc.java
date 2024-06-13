public class arrfunc // main class
{
  public static void main(String[] args) {
    String projects [] = {"ABC","XYZ", "PQR"};
    employee e1 = new employee("Stats", "Anweshan", projects); 
    employee e2 = new employee(e1);

    e1.mutator();
    e2.display();
  }  
}

//Employee datatype
class employee
{
    String eid;
    String ename;
    String eprojects [];

    //Constructor
    employee(String x, String y, String z[])
    {
        this.eid = x;
        this.ename = y;
        this.eprojects = z;
    }

    // copy constructor
    employee (employee e)
    {
        this.eid = e.eid;
        this.ename = e.ename;
        this.eprojects = e.eprojects.clone(); // we have to use clone function, otherwise original array also changes
        //this.eprojects = e.eprojects // this points to the same memory location

    }
    
    // Display function to show output
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        for(int i=0;i<eprojects.length;i++)
            System.out.print(eprojects[i]+":");
            return;
    }

    // for changing elements
    public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }

}
