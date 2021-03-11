
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo {
    public static void main(String[] args) {

        Set <String> set = new HashSet<>();
        
        set.add("element1");
        set.add("element2");
        set.add("element3");

        Stream<String> stream = set.stream();

        stream.forEach( (element) -> {System.out.println(element); });

        // Set <String> setA = new HashSet<>();
        
        // setA.add("element1");
        // setA.add("element2");
        // setA.add("element3");

        // for(String element : setA) {
        //     System.out.println( element );
        // }

        // Iterator<String> iterator = setA.iterator();

        // while( iterator.hasNext() ) {
        //     String element = iterator.next();
        //     System.out.println(element);
        // }

    }
}