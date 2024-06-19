 class Shape{
    public void area(){
             System.out.println("area is unknown");
    }
   public void volume(){
             System.out.println("volume is unknown");
    }
}
 class Rectangle extends Shape{
    public void area(){
             System.out.println("area of Rectangle");
     }
}
 class Cube extends Shape{
     public void area(){
             System.out.println("area of Cube");
     }
     public void volume(){
             System.out.println("volume of Cube");
     }
}
public class areavol{
     public static void compute(Shape s){
            s.area();
            s.volume();
      }
public static void main(String[] args){
            Rectangle r = new Rectangle();
            Cube c = new Cube();
            compute(r);
            compute(c);
      }
}