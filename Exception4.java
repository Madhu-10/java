public class Exception4 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Arithmetic try block called");
                int a=10/0;

                try{
                    int data[]=null;
                    System.out.println(data.length);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
            catch(NullPointerException e){
                System.out.println(e);
            }

            // try{
            //     System.out.println("Array try block called");
            //     int a[]=new int[5];
            //     a[5]=10;
            // }
            // catch(){

            // }
    }
}
