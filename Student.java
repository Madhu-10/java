public class Student {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.assign("Madhu",33);
    }
    static void assign(String name,int roll_no){
        System.out.println("Name is "+ name);
        System.out.println("Roll no is "+ roll_no);
    }

}
