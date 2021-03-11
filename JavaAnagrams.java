import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {
    public static void main(String[] args) {
        
        String stringA = "and";
        String stringB = "dna";

        Map<Character, Integer> mapA = new HashMap <>();
        Map<Character, Integer> mapB = new HashMap <>();

        for (char elem : stringA.toCharArray()) {
            if (mapA.get(elem)==null) {
                mapA.put(elem,1); 
            } else {
                mapA.put(elem, mapA.get(elem)+1);
            };
        }

        for (char elem : stringB.toCharArray()) {
            if (mapB.get(elem)==null) {
                mapB.put(elem,1); 
            } else {
                mapB.put(elem, mapB.get(elem)+1);
            };
        }

        String result = "Anagrams";
        for (Map.Entry<Character, Integer> elemA : mapA.entrySet()) {            
            if(mapA.get(elemA.getKey())!=mapB.get(elemA.getKey())) {
                result = "Not Anagrams";
            };
        }
        System.out.println(result);
    }
}
