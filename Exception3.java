public class Exception3 {
    public static void main(String[] args) {
        int a[]=new int[10];
        try{
            a[10]=20/2;
        }
        // First method
        catch(Exception e){
            System.out.println(e);
        }
        
        //second method
        // catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
        //     System.out.println(e);
        // }

        //Third method
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // catch(NullPointerException e){
        //     System.out.println(e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
    }

}