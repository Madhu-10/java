import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        int lenght1,lenght2,lenght3;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter lengths of the triangle: ");
        lenght1=scr.nextInt();
        lenght2=scr.nextInt();
        lenght3=scr.nextInt();
        if(lenght1==lenght2 && lenght2==lenght3){
            System.out.println("The triangle is equilateral");
        }
        else if(lenght1==lenght2 || lenght2==lenght3 || lenght1==lenght3){
            System.out.println("The triangle is isosceles");
        }
        else{
            System.out.println("The triangle is scalene");
        }

        scr.close();
    }
}
