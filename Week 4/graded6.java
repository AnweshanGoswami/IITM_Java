class Language{
    public void show(){
          System.out.println("In Language class");
    }
    class Programming{
          public void show(){
                System.out.println("In Programming class");
          }
    }
}
public class graded6 {
     public static void main(String[] args) {
      new Language().new Programming().show();
    }
}