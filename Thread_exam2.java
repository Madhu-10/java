class demo{
    void demoMethod(){
        System.out.println("Demo method called");
    }
}
interface demo1{
    void hello();
}

class A extends demo implements Runnable,demo1{
    public void run(){
        System.out.println("currentThread 2 "+ Thread.currentThread().getName());
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
    public void hello(){
        System.out.println("Hello method called");
    }
}

public class Thread_exam2 {
    public static void main(String[] args) {
        A obj = new A();
        Thread t=new Thread(obj,"Thread_Hello");
        t.start();
        obj.demoMethod();
        obj.hello();
    }
}
