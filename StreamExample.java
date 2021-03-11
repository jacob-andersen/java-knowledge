import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        List<String> stream = list.stream()
                                .filter(element -> element.contains("e"))
                                .collect(Collectors.toList());
        
        Set<String> collectToSet = Stream.of("Monkey","Lion","Giraffe", "Lemur", "Lion").collect(Collectors.toSet());
        
        for (String elem : collectToSet) {
            System.out.print(elem + " ");
        }
        System.out.println(stream);
    }
    
}