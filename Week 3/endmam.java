class mammal{
    public String name;
    public int lifespan;

    public mammal(){
        name = "Tiger";
        lifespan = 45;
    }

    public void show(){
        System.out.println("name = " + name + "lifespan = " + lifespan );
    }

    public void display(){
        System.out.println("Mammal detials");
    }
}

class endangered extends mammal{
    public boolean endangered_status;

    public endangered(){
        endangered_status = false;
    }

    public void show(){
        System.out.println("endanger status of "+
        this.name + " is " + endangered_status);
    }

    public void display(String species){
        System.out.println("Endanger status");

    }
}

public class endmam{
    public static void main(String[] args) {
        mammal m1 = new endangered();
        m1.show();
        m1.display();
    }

}