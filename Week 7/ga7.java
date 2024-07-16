public class ga7 {
    public static void main(String[] args) {
         String name = "IIT Madras";
         try{
               System.out.println(name.charAt(10));
         }
         catch (StringIndexOutOfBoundsException e){
          System.out.println("String index out of its range");

        //catch (Exception e){
        //  System.out.println("String index out of its range");

        //catch (Throwable t){
        //    System.out.println("String index out of its range");

        // All of these work
      }
    }
}