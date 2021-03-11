import java.util.ArrayList;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.forEach( (element) -> {
            System.out.println( element );
        });
    }
    
}
