import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        TreeMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("a","one");
        sortedMap.put("b","two");
        sortedMap.put("c","three");

        Iterator iterator = sortedMap.keySet().iterator();
        while(iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = sortedMap.get(key);
            System.out.println(value);
        }

        String firstKey = (String) sortedMap.firstKey();
        String lastKey = (String) sortedMap.lastKey();
        System.out.println(firstKey+" "+lastKey);



        
    }
    
}
