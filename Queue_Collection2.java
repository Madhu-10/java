import java.util.Deque;
import java.util.LinkedList;

public class Queue_Collection2 {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();
        dq.offerFirst("One");
        dq.offerLast("Four");
        dq.offerLast("Five");
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq);
        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}
