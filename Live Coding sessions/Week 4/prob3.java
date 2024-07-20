import java.util.Scanner;
interface Generatable{
    abstract void feeGenerate(Student s);
}
class Student {
    private String name;
    private double fee;
    private int backlogs;
    public Student(String name, int backlogs) {
        this.name = name;
        this.backlogs = backlogs;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public int getBacklogs() {
        return backlogs;
    }
    public String toString() {
        return name + ", " + fee + ", " + backlogs;
    }
}
class ExamBranch{
    private class Regular implements Generatable{
        public void feeGenerate(Student s) {
            s.setFee(1500.00);
        }
    }
    private class Supple implements Generatable{
        public void feeGenerate(Student s) {
            if(s.getBacklogs() == 1)
                s.setFee(1500 + 500);
            else if(s.getBacklogs() == 2)
                s.setFee(1500 + 1000);
            else if(s.getBacklogs() >=3 )
                s.setFee(1500 + 2000);
    }
}
    // Define method getRegularFee()
    
    //We use generatble return type because Regular and supple classes is private,
    //And therefore inaccessible outside this class
    /*
    public Generatable getRegularFee(){
        return(new Regular());
    }
    // Define method getSuppleFee()
    public Generatable getSuppleFee(){
        return(new Supple());
    }
    */
    
    public Regular getRegularFee(){
        return(new Regular());
    }
    // Define method getSuppleFee()
    public Supple getSuppleFee(){
        return(new Supple());
    }
    
    
}
public class prob3 {
    // Define method getStudentsFee()
    public static Student[] getStudentsFee(Student slist[]){
        //to access the getFee methods, we need to create an object of the outer class
        //which encapulates the inner private classes
        ExamBranch ob = new ExamBranch();
        for(Student student:slist){
            if (student.getBacklogs()==0){
                //statically, it needs to be off type generatble because regular is
                //inaccessible outside the class
               Generatable r = ob.getRegularFee();
               r.feeGenerate(student);
                //ob.getRegularFee().feeGenerate(student);
            }
            else{
                 //statically, it needs to be off type generatble because supple is
                //inaccessible outside the class
                Generatable s = ob.getSuppleFee();
                s.feeGenerate(student);
                //ob.getSuppleFee().feeGenerate(student);
            }
        }
        return slist;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] sArr = new Student[3];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = new Student(sc.next(), sc.nextInt());
        }
        sArr = prob3.getStudentsFee(sArr);
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
    }
}

/*Samplle input: Ananya 0
Acharya 4
Ashok 2

 * Expected output: Ananya, 1500.0, 0
Acharya, 3500.0, 4
Ashok, 2500.0, 2
 */
