public class factRecursive {
    static int fact;
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            fact =n* factorial(n-1);
            return fact;
        }
        
    }
    public static void main(String[] args) {
        factorial(5);
        System.out.println(fact);
    }
}
