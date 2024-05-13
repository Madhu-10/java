class student{
    int roll;
    String name;
    int age;
    String course;
    student(){
        this(1,"Madhu",21,"java");//calling parametrized constructor
        System.out.println("Default constructor called");
    }
    student(int roll, String name, int age, String course){//parameterized constructor
        // this();//calling default constructor
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void show(){
        System.out.println("Rollno "+roll+" name "+name+" age "+age+" course "+course);
    }
}
public class this_keyword1 {
    public static void main(String[] args) {
        student s=new student();
        s.show();
    }
}
