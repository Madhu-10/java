class Book extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("currentThread 1 "+ Thread.currentThread().getState());
        System.out.println("UpdateData called");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
class User extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("currentThread 2 "+ Thread.currentThread().getState());
            System.out.println("display method called");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Thread_exam1 {
    public static void main(String[] args) {
        Book b = new Book();
        User u = new User();
        System.out.println("currentThread "+ Thread.currentThread().getState());
        System.out.println("currentThread "+ Thread.currentThread().getState());
        b.start();
        u.start();
        // b.updateData();
        // u.display();
    }
}
