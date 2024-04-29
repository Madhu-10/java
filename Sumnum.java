import java.util.Scanner;

public class Sumnum {
    public static void main(String args[]){
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scr.nextInt();
        int s=0,n;
        while (num>0) {
            n=num%10;
            s=s+n;
            num=num/10;
        }
        System.out.println("Sum of digits is: "+s);
        scr.close();
    }
}
