class A {
    void display() {
        System.out.println("Display A");
    }
 }
 
 class B extends A {
    void display() {
        super.display();
        System.out.println("Display B");
    }
    void display(String s) {
        System.out.println("Display B." + s);
    }
 }
 
 class C extends B {
    void display() {
        super.display();
        System.out.println("Display C");
    }
 
    void display(String s) {
        System.out.println("Display C." + s);
    }
 }
 
 public class Example {
    public static void main(String[] args) {
        B obj = new C();            // LINE 1
        obj.display();
        obj.display("Successful!"); // LINE 2
    }
 }