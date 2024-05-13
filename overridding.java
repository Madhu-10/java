class Animals{
    void sound(){
        System.out.println("Animal sounds");
    }
    protected void food(){
        System.out.println("Animal food");
    }
}
class Dog extends Animals{
    void sound(){
        System.out.println("Barking.....sounds");
    }
    public void food(){
        System.out.println("Biscuit");
    }
}
class Cat extends Animals{
    void sound(){
        System.out.println("Meow.....sounds");
    }
    public void food(){
        System.out.println("Milk");
    }
}

public class overridding {
    public static void main(String[] args) {
        // Animals obj1=new Animals();
        // obj1.sound();
        // Animals obj2=new Dog();
        // obj2.sound();
        // Animals obj3 = new Cat();
        // obj3.sound();
        Animals obj;
        obj=new Animals();
        obj.sound();
        obj.food();
        obj=new Dog();
        obj.sound();
        obj.food();
        obj=new Cat();
        obj.sound();
        obj.food();
    }
}