import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scr.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        scr.close();
    }
}
