public class exception1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        // int data[]=null;
        try{
           c=a/b; 
        // System.out.println(data.length);
        }
        catch(Exception e){
            c=a/5;
            System.out.println(e);
        }
        System.out.println(c);
        System.out.println("End of the program");
    }
}
