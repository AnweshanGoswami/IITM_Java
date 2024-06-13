public class arrfunc 
{
  public static void main(String[] args) {
    String projects [] = {"ABC","XYZ", "PQR"};
    String id = "ANWE";
    String name ="Stats";
    employee e1 = new employee(id, name, projects);
    e1.display();
  }  
}

class employee
{
    String eid;
    String ename;
    String eprojects [];

    employee(String x, String y, String z[])
    {
        this.eid = x;
        this.ename = y;
        for(int i=0; i<z.length; i++)
            eprojects[i] = z[i];
    }
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        for(int i=0;i<eprojects.length;i++)
            System.out.print(eprojects[i]+":");
            return;
    }

}
