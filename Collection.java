
import java.util.ArrayList;
import java.util.Iterator;


public class Collection{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2,15);
        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println("BEFORE "+list);
        list.remove(2);
        System.out.println("AFTER "+ list);

        ArrayList<String> slist = new ArrayList<>();
        slist.add("Hello");
        slist.add("World");
        System.out.print(slist);
        System.out.println();

        // ArrayList alist = new ArrayList<>();
        // alist.add(1);
        // alist.add("Hii");
        // System.out.println(alist);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+"  ");
        }
        System.out.println();
        for(String i: slist){
            System.out.println(i);
        }
    }
}