import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // q.add(10);
        // q.add(20);
        // q.offer(30);
        System.out.println(q);
        // System.out.println(q.element());
        System.out.println(q.peek());
        // System.out.println(q.remove());
        System.out.println(q.poll());



    }
}
