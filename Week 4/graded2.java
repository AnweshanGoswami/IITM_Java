interface Shape{
    public double area();
    public default double volume() {
         return -1.0;
    }

   // public void print();
}

interface Printable{
     public default void print() {
           System.out.println("not implemented");
    }
}

class Rectangle implements Shape, Printable{
     private double w, h;
     public Rectangle(double w_, double h_) {
           w = w_;
            h = h_;
   }
     @Override
   public double area() {
        return w * h;
   }
     @Override
   public void print() {
        System.out.print(area() + " ");
        System.out.print(volume());
   }
}

public class graded2{
      public static void main(String[] args) {
         Shape s = new Rectangle(20.0, 50.0);
         s.print();
   }
}