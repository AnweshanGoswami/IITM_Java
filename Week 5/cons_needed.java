class date{
    int day, month, year;
    
    void setDate(int x, int y, int z){
        this.day = x;
        this.month = y;
        this.year = z;
    }

    int getDay(){
        return(day);
    }
}

public class cons_needed{
    public static void main(String[] args) {
        date d = new date();
        d.setDate(1,2,3);
        System.out.println(d.getDay());
    }
}