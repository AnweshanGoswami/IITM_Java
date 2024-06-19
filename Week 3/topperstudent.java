 class Student{
    public String sname;
    public String sid;
    public int sclass;

    public Student(String s_name,String s_id, int s_class){
    //public Student(){
         this.sname = s_name;
         this.sid = s_id;
         this.sclass = s_class;
    }
    public void display() {
         System.out.println("name:"+sname);
         System.out.println("id:"+sid);
         System.out.println("class:"+sclass);
    }
}
 class Toppers extends Student{
    public int marks;

    public Toppers(int marks){
        super("Anweshan", "Stats", 12);
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println("marks:"+marks);
    }
}  
public class topperstudent{
    public static void main(String[] args){
         Toppers t = new Toppers(30);
         t.display();
    }
}