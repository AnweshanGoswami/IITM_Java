

class hello{
    public void display(){
        System.out.print("Hii ");
    }
}

public class Ram extends hello{
    public void display(String s){
        display();
        System.out.println(s);
    }

    public static void main(String[] args) {
        hello a = new Ram();
        ((Ram)a).display("ram");
    }

}

