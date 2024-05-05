class Animal{
    String breed;
    String color;
    String name;
    String sound;
    void sound(){
        System.out.println("Sound: "+sound);
    }

}
class Dog extends Animal{
    int lifespan;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color: "+color);
        System.out.println("Lifespan: : "+lifespan);
    }
}
class Cat extends Animal{
    void details(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color: "+color);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Dog obj =new Dog();
        obj.name="shiro";
        obj.breed="lab";
        obj.color="white";
        obj.sound="barking";
        obj.lifespan=10;
        obj.display();
        obj.sound();

        Cat obj1=new Cat();
        obj1.name="Kiyo";
        obj1.breed="lab";
        obj1.color="Black";
        obj1.sound="meow";
        obj1.details();
        obj1.sound();

        
    }
}