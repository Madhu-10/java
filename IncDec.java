import java.util.Scanner;

public class IncDec {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1=scr.nextInt();
        System.out.print("Enter number 2: ");
        int num2=scr.nextInt();
        System.out.print("Enter number 3: ");
        int num3=scr.nextInt();
        if(num1 < num2 && num2<num3){
            System.out.println("Increasing");
        }
        else if(num1>num2 && num2>num3){
            System.out.println("Decreasing");
        }
        else{
            System.out.println("Neither increasing or decreasing order");
        }

        scr.close();
    }
}
