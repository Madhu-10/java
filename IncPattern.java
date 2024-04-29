import java.util.Scanner;

public class IncPattern {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=scr.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print((k++)+"\t");
            }
            System.out.println();
        }

        scr.close();
    }
}
