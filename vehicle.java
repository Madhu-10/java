class car{
    String color;
}
class bike{
    String color="blue";
}
public class vehicle {
    public static void main(String[] args) {
        car car = new car();
        bike bike = new bike();
        car.color="red";
        System.out.println("car color is "+car.color);
        System.out.println("bike color is "+bike.color);
    }
}
