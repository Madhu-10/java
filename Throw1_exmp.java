import java.util.Scanner;

class expDemo{
    void division(int x, int y) throws ArithmeticException,NullPointerException{
        int result=x/y;
        System.out.println(result);
    }
    
}
public class Throw1_exmp {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter 2 Number: ");
        int x=scr.nextInt();
        int y=scr.nextInt();
        expDemo obj=new expDemo();
        try{
            obj.division(x,y);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of the program");

        scr.close();
    }
}
