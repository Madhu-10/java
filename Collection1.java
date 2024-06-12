import java.util.ArrayList;

class Employee{
    int empId;
    String empName;
    int salary;
    int contact;
    Employee(int empId, String empName, int salary, int contact){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
        this.contact=contact;
    }
}

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e=new Employee(1, "sam" , 20000, 12345678);
        Employee e1=new Employee(2, "john", 15000,9876543);
        list.add(e);
        list.add(e1);
        System.out.println(list);
        for(Employee ed : list){
            System.out.println(ed.empId);
            System.out.println(ed.empName);
            System.out.println(ed.salary);
            System.out.println(ed.contact);
        }

    }
}
    