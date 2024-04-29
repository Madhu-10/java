class methodSample {
    int rollno;
    String name;
    int age;
    void insertData(int r, String n,int a){
            rollno=r;
            name=n;
            age=a;
    }
    void display(){
        System.out.println("Roll no "+rollno);
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }
}
public class methods1 {
    public static void main(String[] args) {
        methodSample obj = new methodSample();
        obj.insertData(1,"Madhu",21 );
        obj.display();
    }
}
