import java.util.*;
//define user defined exception InvalidInputEx
//We do not know when this exception will be triggered
//And we need to do exactly that in the set value function
//We cant throw this function in the catch block of another error
class InvalidInputEx extends Exception{
    //Constructor
    public InvalidInputEx(String message, Throwable cause){
    super(message, cause);
    }
    
    public InvalidInputEx(String message){
        this(message, null);
    }
}

//define the class IntList with 
class IntList{
    
    //instance variable of int[]
    public int [] list = new int[5]; 
    
    //Constructor initialises default values to zero
    public IntList() {
        Arrays.fill(list, 0);
    }
    //and methods set_value, getArray()
    
    /*public void set_value(int index, int value) throws InvalidInputEx{
        try{
            list[index] = value;
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new InvalidInputEx("invalid input index");
        }
    }*/
    //The problem with what we just did there is that its a try and catch block. Therefore, it will try something, and upon error
    //the catch block will try to fix that issue. 
    //However, throwing another exception is not fixing the issue
    //Therefore, we need to  check if the conditions are being met and if not, then we throw the error
    //Which travels up to the main finction and is dealt with in their try and catch block

    //and methods set_value, getArray()
    public void set_value(int index, int value) throws InvalidInputEx{
        if (index < 0 || index > 4){
        Throwable cause = new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length 5");
        throw new InvalidInputEx("invalid index input", cause);
        }
        
        list[index] = value;
    }
    
    public int[] getArray(){
        return (list);
    }
    
}





class grpa2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntList ilist = new IntList();
        try {
            for(int i = 0; i < 5; i++) {			
                int n = sc.nextInt();
                int m = sc.nextInt();
                ilist.set_value(n, m);
            }
        }
        catch(InvalidInputEx e) {
            System.out.println(e.getMessage());
            Throwable ori = e.getCause();
            System.out.println(ori.getMessage());
        }	
        int[] i_arr = ilist.getArray();
        for(int i = 0; i < i_arr.length; i++)
            System.out.print(i_arr[i] + " ");
    }
}