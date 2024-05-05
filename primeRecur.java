public class primeRecur {
    static int p;
    static int prime(int n){
        if(n==0){
            return 1;
        }
        else{
           p = n/ prime(n-1);
            return p;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
    }
}
