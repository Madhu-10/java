class student{
    final int id;
    student(){
        id=10;
    }
    void display(){
        System.out.println("Student class called");
    }
}
class teacher extends student{
    void display(){
        super.display();
        System.out.println("Teacher class called");
    }
}

public class final_exm {
    public static void main(String[] args) {
        student s=new student();
        // s.id=20;
        System.out.println(s.id);
        teacher t=new teacher();
        t.display();
    }
}
