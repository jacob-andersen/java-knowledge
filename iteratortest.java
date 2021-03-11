import java.util.Iterator;
import java.util.LinkedList;

public class iteratortest {

public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("hello");
    list.add("world");

    Iterator<String> it = list.iterator();

    while (it.hasNext()) {
        System.out.println(it.next());
    }

    for (String elem : list) {
        System.out.println(elem);
    }

}
}