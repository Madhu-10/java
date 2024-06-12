import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset_collection{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100);
        set.add(300);
        set.add(400);
        System.out.println(set);
        set.remove(400);
        System.out.println(set);
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("Madhu");
        set1.add("Deepi");
        set1.add("Dharshini");
        set1.add("Priyanka");
        set1.add("Kethisa");
        set1.add("Divya");
        set1.removeIf(str -> str.contains("Divya"));
        System.out.println(set1);
        if(set1.contains("Madhu")){
            System.out.println("Contains");
        }
        else{
            System.out.println("Not contains");
        }
        System.out.println(set1);
        
        Iterator<String> itr=set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}