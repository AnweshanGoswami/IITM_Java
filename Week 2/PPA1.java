import java.util.Scanner;

class Rectangle {
    int w;    //width
    int h;    //height
//Apparently no constructor is needed, we are initialsing in seperate functions

//LINE-1: write the function setw(int) to initialize w
void setw(int x)
{
    w = x;
}

//LINE-2: write the function seth(int) to initialize h
void seth(int x)
{
    h = x;
}
	
//LINE-3: write the function area() to return area of rectangle
int area()
{
    int a = w*h;
    return a;
}
}
public class PPA1{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        Rectangle r = new Rectangle();
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print(area);
    }
}
    

