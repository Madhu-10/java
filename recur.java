public class recur {
    static int count=0;
    static void recursive_method(){
        
        if(count<=5){
            count++;
            System.out.println("Hello");
            recursive_method();
        }
        
    }
    public static void main(String[] args) {
        recursive_method();
    }
}
