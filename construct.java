public class construct {
    int rollno;
    String name;
    int age;
    
    construct(int r,String n){
        rollno=r;
        name=n;
    }
    construct(int r,String n,int a){
        rollno=r;
        name=n;
        age = a;
    }
    public static void main(String[] args) {
        construct c=new construct(3,"Madhu");
        construct c1 = new construct(4,"Deepi", 20);
        System.out.println("Roll no: "+c.rollno +", Name: "+ c.name);
        System.out.println("Roll no: "+c1.rollno +", Name: "+ c1.name+", Age: "+c1.age);
    }
}
