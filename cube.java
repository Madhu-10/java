import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int n=scr.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Number is "+ i +" and cube of "+ i +" is :  "+ (i*i*i));
        }

        scr.close();
    }
}
