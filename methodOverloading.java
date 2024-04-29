class calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    float add(int a,float b, int c){
        return a+b+c;
    }
    float add(float a,float b){
        return a+b;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        calculator obj=new calculator();
        System.out.println(obj.add(2,8));
        System.out.println(obj.add(10,15,13));
        System.out.println(obj.add(1,2.4f,4));
        System.out.println(obj.add(2.0f, 3.7f));
}
}
