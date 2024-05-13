import java.util.*;
class demo{
    private int r_no;
    private String name;
    private int age;
    private String sub;
    private int mark;

    public int getR_no() {
        return this.r_no;
      }
      public void setR_no(int value) {
        this.r_no = value;
      }
  
      public String getName() {
        return this.name;
      }
      public void setName(String value) {
        this.name = value;
      }
  
      public int getAge() {
        return this.age;
      }
      public void setAge(int value) {
        this.age = value;
      }
  
      public String getSub() {
        return this.sub;
      }
      public void setSub(String value) {
        this.sub = value;
      }
  
      public int getMark() {
        return this.mark;
      }
      public void setMark(int value) {
        this.mark = value;
      }
}

public class encapsulation_exm2 {
    public static void main(String[] args) {
        demo d=new demo();
        Scanner scr=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter Rollno : ");
            d.setR_no(scr.nextInt());
            System.out.println("Roll no : "+d.getR_no());

            System.out.println("Enter Name: ");
            d.setName(scr.nextLine());
            System.out.println("Name : "+d.getName());

            System.out.println("Enter Age: ");
            d.setAge(scr.nextInt());
            System.out.println("AGe : "+d.getAge());

            System.out.println("Enter Subject: ");
            d.setSub(scr.nextLine());
            System.out.println("Subject : "+d.getSub());

            System.out.println("Enter Mark: ");
            d.setMark(scr.nextInt());
            System.out.println("Mark : "+d.getMark());
        }

        
        scr.close();
    }
}
