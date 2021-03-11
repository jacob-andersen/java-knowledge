import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("one", "first");
        map.put("two", "second");
        map.put("three", "third");

        // for(String value : map.values()){
        //     System.out.println(value);
        // }

        Stream<String> keys = map.keySet().stream();
        keys.forEach((value) -> {
            System.out.println(value);
        });
        
        Stream<String> values = map.values().stream();
        values.forEach((value) -> {
            System.out.println(value);
        });

        // using an Iterator

         Set<Map.Entry<String, String>> entries = map.entrySet();

         Iterator<Map.Entry<String, String>> iterator =  entries.iterator();

         while(iterator.hasNext()) {
             Map.Entry<String, String> entry = iterator.next();
             String key = entry.getKey();
             String value = entry.getValue();
         }

         // using a For-Each Loop

         for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
         }

         System.out.println(map.size());
         map.clear();
         System.out.println(map.isEmpty());
    }
}