import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Map_Collection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"three");
        map.put(2,"two");
        map.put(4,"four");
        map.put(5,"seven");

        map.putIfAbsent(6,"six");
        map.putIfAbsent(6,"seven");//doesn't replace like above two

        System.out.println(map);

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(7,"seven");
        map1.putAll(map);
        System.out.println(map1);

        System.out.println(map.get(3));

        if(map.containsValue("two")){
            System.out.println("Contains");
        }
        map.replace(5, "five");
        // map.remove(6);
        map.remove(6, "six");//same as remove(key). both methods remove kay and value pair
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        Iterator itr=map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr1=map.values().iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        Iterator itr2=map.entrySet().iterator();
        while(itr2.hasNext()){
            // System.out.println(itr2.next());

            Map.Entry m1 = (Entry) itr2.next();
            System.out.println(m1.getKey() + " "+ m1.getValue());
        }
        System.out.println("-----------Using ForEach---------------");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
    }

}
