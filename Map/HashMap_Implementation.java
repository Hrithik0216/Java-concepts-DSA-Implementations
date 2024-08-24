package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Implementation {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Seven");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        System.out.println(set.toString());
        System.out.println(map.toString());
       for(Map.Entry<Integer,String> entry: map.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());
       }
    }
}
