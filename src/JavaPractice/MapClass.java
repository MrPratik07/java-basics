package JavaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(7,"Aazz");
        map.put(1,"pratik");
        map.put(2,"gaikwad");
        map.put(5,"aasert");
        map.put(4,"asdee");
        map.put(3,"azdqq");
        map.put(null,"aasqwq");
        System.out.println(map);
    }
}
