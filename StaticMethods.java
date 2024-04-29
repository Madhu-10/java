public class StaticMethods {
    public static void main(String[] args) {
        show();
        StaticMethods obj=new StaticMethods();
        obj.welcome();
    }
     static void show(){
        System.out.println("Show method- stc to stc");
     }
     void welcome(){
        System.out.println("Welcome method - stc to nstc");
        hello();
     }
     void hello(){
        System.out.println("Hello method - nstc to nstc");
        world();
     }
     static void world(){
        System.out.println("world method - nstc to stc");
     }
}
