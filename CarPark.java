import java.util.Scanner;

public class CarPark {

    // static void method(int avail){
    //     System.out.println("Available spaces: "+ avail);
    //     System.out.println("1. Park a Car");
    //     System.out.println("2. Remove a Car");
    //     System.out.println("3. Exit");
    //     System.out.println("Enter your choice: ");
    //     }
    // public static void main(String[] args) {
    //     int avail=10;
    //     int choice;
    //     method(avail);
    //     Scanner scr=new Scanner(System.in);
    //     choice=scr.nextInt();
    //     if(choice==1){
    //         System.out.println("Car parked successfully");
    //         avail--;
    //         method(avail);
    //         choice=scr.nextInt();
    //     }
    //     if(choice==2){
    //         System.out.println("Car removed from the parking lot");
    //         avail++;
    //         method(avail);
    //         choice=scr.nextInt();
    //     }
    //     if(choice==3){
    //         System.out.println("Exiting...");
    //     } 
    //     scr.close();
    // }
    public static void main(String[] args) {
        int avail=10;
        CarPark obj=new CarPark();
        int choice=obj.method(avail);
        if(choice<4){
        switch(choice){
            case 1:
                System.out.println("Car parked successfully");
                --avail;
                obj.method(avail);
                break;
            case 2:
                System.out.println("Car removed from the parking lot");
                ++avail;
                obj.method(avail);
                break;
            case 3:
                System.out.println("Existing...");
                break;
            default:
                System.out.println("Inavalid input");
                break;
        }
    }
    }
    int method(int avail){
        System.out.println("Available spaces: "+ avail);
        System.out.println("1. Park a Car");
        System.out.println("2. Remove a Car");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
        Scanner scr=new Scanner(System.in);
        int choice=scr.nextInt();
        return choice;
    }
}
