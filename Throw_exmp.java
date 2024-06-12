import java.util.*;

public class Throw_exmp {
    public static void main(String args[]){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=scr.nextInt();

        if(age<18){
            try{
                throw new InvalidAgeException();
            }
            catch(InvalidAgeException e){
                e.printStackTrace();
                // System.out.println(e);
            }
        }
        else{
            System.out.println("Your Eligible");
        }
        System.out.println("End of the program");

        scr.close();
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(){
        System.out.println("Not Eligible");
    }
}