interface Inter{
    public abstract void greet();
}
class Greetings{
    private String country;
    public void setCountry(String s){
          this.country = s;
    }
    public String getCountry(){
         return country;
    }
    public Inter checkCountry(){
        if(getCountry() == "India"){
              return new IndiaGreetings();
        }
        return new WorldGreetings();
    }
    private class IndiaGreetings implements Inter{
         public void greet(){
               System.out.println("Hello"+ " "+"India");
         }
   }
   private class WorldGreetings implements Inter{
         public void greet(){
                System.out.println("Hello"+ " "+"World");
         }
    }
}
public class graded5 {
     public static void main(String[] args) {
          Greetings g = new Greetings();
          g.setCountry("India");
          g.checkCountry().greet();
          //g.IndiaGreetings.greet();
         // g.greet();  //does not work because greet is a private thing inside the world and india classes. So we have to check country in order to return them

     }
}
