abstract class parentClass{
    abstract void sample();
    void display(){
        System.out.println("Parent class method called");
    }
}
class childClass extends parentClass{
    void sample(){
        System.out.println("Abstract method called");
    }
}
class demo extends parentClass{
    void sample(){
        System.out.println("demo method called");
    }
}
public class abstract_exp{
    public static void main(String[] args) {
        // parentClass obj=new childClass();
        // obj.display();
        // obj.sample();
        // parentClass obj1=new demo();
        // obj1.sample();
        parentClass obj;
        obj=new childClass();
        obj.display();
        obj.sample();
        obj=new demo();
        obj.sample();

    }
}