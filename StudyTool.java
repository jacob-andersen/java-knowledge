import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudyTool {
    public static void main(String[] args) {
        Map<Integer, String> superTopics = new TreeMap<Integer, String>();
        List<String> values = new ArrayList<>();
        
        // ArrayList<String> superTopics = new ArrayList<>();
        superTopics.put(1, "FRONT-END");
        superTopics.put(2, "BACK-END");
        superTopics.put(3, "CONCEPTS");
        superTopics.put(4, "LANGUAGES");
        superTopics.put(5, "OTHER");
        // ArrayList<String> subTopics = new ArrayList<>();
        // ArrayList<String> topicContent = new ArrayList<>();

        // Random rand = new Random();
        // for (int i=0;i<10;i++) {
        //     System.out.println(superTopics.get(i));
        // }

        for (Map.Entry<Integer, String> entry : superTopics.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}