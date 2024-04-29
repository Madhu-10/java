public class oops{
    String color;
        void type(){
            System.out.println("Type method called");
        }
    public static void main(String[] args) {
        oops obj = new oops();
        obj.color="red";
        System.out.println(obj.color);
        oops obj1 = new oops();
        obj1.color="blue";
        System.out.println(obj1.color);
        obj.type();
    }
}