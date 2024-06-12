import java.util.LinkedList;

public class Linked_collection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.removeFirst();
        System.out.println(list);

        list.addFirst(100);
        list.addLast(200);
        list.add(1,500);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        
        list1.add(2000);
        list1.add(5000);
        System.out.println(list1);

        list1.addAll(list);
        System.out.println(list1);

        list1.removeAll(list);
        System.out.println(list1);


    }
}
