class Person{
    private String name;
    private long aadharno;
    public Person(String name, long aadharno){
        this.name = name;
        this.aadharno = aadharno;
    }
    public void print() {
        System.out.println("name : " + name);
        System.out.println("aadharno : " + aadharno);
    }
}

class Employee extends Person{
    private double salary;

    //implement the constructor
    public Employee(String name, long aadharno, double s){
        super(name, aadharno);
        this.salary = s; 
    }
    

    //override print method
    public void print(){
        super.print();
        System.out.println("salary : " + salary);
    }
}

class ContactEmployee extends Employee{
    final private static double hourlyPay = 100.00;
    private int contactHour;
	
    //implement the constructor
    //salary is computed as contactHour * hourlyPay  
    public ContactEmployee(String name, long aadharno, int cont){
        
        super(name, aadharno, cont*hourlyPay);
        this.contactHour = cont;
        //salary = contactHour * hourlyPay;
        }
}

class empgra{
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String nm1 = "Anweshan";
        String nm2 = "Goswami";
        long adh1 = 234323;
        long adh2 = 432345;
        double sal = 45000;
        int cont = 200;
        Employee[] eArr = new Employee[2];
        eArr[0] = new Employee(nm1, adh1, sal);
        eArr[1] = new ContactEmployee(nm2, adh2, cont);
        for(Employee e : eArr)
            e.print();
    }
}