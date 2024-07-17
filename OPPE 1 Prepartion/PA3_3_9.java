class A{
    public float g;

    public A(){
        g = 9.8f;
    }
    public void show(){
         System.out.println("g = "+g);
    }
}
class B extends A{
   public double e;

   public B(double num){
        e = num;
   }
   public void show(){
         System.out.println("e = "+e);
   }
}
public class PA3_3_9{
   public static void main(String args[]){
        A obj1 = new B(2.718);

        A ptr1 = (A)obj1;
        A ptr2 = (B)obj1;
        B ptr3 = (B)obj1;

        ptr1.show();
        ptr2.show();
        ptr3.show();
   }
}