import java.util.Scanner;

public class scannerEx {
    public static void main(String[] args) {
        int a;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=scr.nextInt();
        scr.nextLine();
        System.out.println("Enter the name");
        String name = scr.next();
        scr.nextLine();
        System.out.println("Enter the character: ");
        char c=scr.nextLine().charAt(0);
        System.out.println("a is: "+a);
        System.out.println("name is: "+name);
        System.out.println("The character is: "+c);
        scr.close();
    }
}
