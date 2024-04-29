import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word;
        String rev="";
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter the word: ");
        word=scr.nextLine();
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }

        scr.close();
    }
}
