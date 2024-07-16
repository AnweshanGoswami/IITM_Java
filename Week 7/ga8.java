public class ga8{
    public void show(){
          NullPointerException e = new NullPointerException();
          e.initCause(new ArithmeticException());
          throw e;
    }
    public static void main(String[] args) {
          ga8 object = new ga8();
          try{
               object.show();
          }
          catch (Exception e){
                System.out.println(e);
                System.out.println(e.getCause());
          }
    }
} 