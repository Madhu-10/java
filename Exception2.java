public class Exception2 {
   public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;

        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
            c=a/5;
            System.out.println("c value is: "+c);
        }
        finally{
            System.out.println("Finally block called");
        }
        System.out.println("End of the program");
   } 
}
