import java.util.HashMap;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"pune");
        map.put(1,"Parbhani");
        System.out.println(map.keySet());
     Set<Integer> city = map.keySet();
        System.out.println(city);
        Collection<String> values = map.values();
        System.out.println(values);


    }
}
