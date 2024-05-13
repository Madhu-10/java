class student{
    int id;
    String name;
    student(int id, String name){
        this.id=id;
        this.name=name;
        addData(this);
    }
    void addData(student obj){
        System.out.println("Id :"+obj.id+" Name :"+obj.name);
    }
}

public class this_method {
    public static void main(String[] args) {
        student s=new student(1,"madhu");
    }
}
