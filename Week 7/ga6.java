public class ga6{
    public static void main(String[] args) {
         try{
             int a=10/0;
         }

         //catch(Exception e){
         //   System.out.println("Exception caught");
        // }
         finally{
              System.out.println("In finally block");
         }

        //catch(Exception e){ //cant write catch block after finally
        //    System.out.println("In catch block");
        // }
        System.out.println("Program execution finished");
    }
}