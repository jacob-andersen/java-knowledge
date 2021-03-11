import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        

        TreeSet<String> sortedSet = new TreeSet();

        sortedSet.add("one");
        sortedSet.add("two");
        sortedSet.add("three");

        Iterator <String> iterator = sortedSet.iterator();
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

        System.out.println(sortedSet.last());

        TreeSet<String> sortedSet2 = new TreeSet();

        sortedSet2.add("a");
        sortedSet2.add("b");
        sortedSet2.add("c");
        sortedSet2.add("d");
        sortedSet2.add("e");
        
        SortedSet headset = sortedSet2.headSet("e");
        SortedSet tailset = sortedSet2.tailSet("b");
        SortedSet subset = sortedSet2.subSet("a","c");

        System.out.println(headset);
        System.out.println(tailset);
        System.out.println(subset);

    }
    
}
