import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=scr.nextInt();
        if(year%4==0){
            System.out.println("It's a Leap Year");
        }
        else{
            System.out.println("It's not a leap year");
        }
        scr.close();
    }
}
