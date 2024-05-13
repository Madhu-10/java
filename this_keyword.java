class student{
    //instance variables
    int roll;
    String name;
    int age;
    String course;
    void setData(int roll, String name, int age, String course){
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void show(){
        System.out.println("RollNo : "+roll+" name : "+name+" age "+age+" course "+course);
        display(); //this.display();
        this.display();
    }
    void display(){                                                     
        System.out.println("Display method called");
    }
}
public class this_keyword{
    public static void main(String[] args) {
        student obj=new student();
        obj.setData(1,"madhu",21,"java");
        obj.show();
    }
}