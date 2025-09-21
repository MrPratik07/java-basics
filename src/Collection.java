import java.util.HashMap;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Pratik");
        map.put(2,"Mrunal");
        for(Integer s:map.keySet()) {
            System.out.println(s+" "+map.get(s));
        }

        for(Map.Entry<Integer, String> element:map.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }

    }
}
