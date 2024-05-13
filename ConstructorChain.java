class student{
    int roll;
    String name;
    int age;
    String course;
    float fees;
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
    student(int roll, String name, int age, String course,float fees){
        this(roll,name,age,course);
        this.fees=fees;
    }
    void show(){
        System.out.println("Rollno "+roll+" name "+name+" age "+age+" course "+course+" fees "+fees);
    }
}
public class ConstructorChain {
    public static void main(String[] args) {
        student s=new student(1,"madhu",21,"java");
        student s1=new student(2,"deepi",20,"python",35000);
        s.show();
        s1.show();
    }
}