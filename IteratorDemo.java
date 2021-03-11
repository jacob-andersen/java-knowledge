import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator();
        
        // iterator.forEachRemaining((element) -> {
        //     System.out.println(element);
        // });

        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");

        Iterator<String> iterator2 = set.iterator();

        while(iterator2.hasNext()) {
            Object nextObject = iterator2.next();
            System.out.println(nextObject.toString());
        }

    }
}