import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalJava {
    public static void main(String[] args) {
        Set<String> collectToSet = Stream.of(
   "Monkey", "Lion", "Giraffe", "Lemur", "Lion") 
   .collect(Collectors.toSet());
   System.out.println(collectToSet);
    }
}