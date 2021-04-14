import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class FunctionTest {
public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    Set<Integer> set = new HashSet<>();
    boolean b1 = set.add(66);
    boolean b2 = set.add(10);
    boolean b3 = set.add(66);
    boolean b4 = set.add(8);
    set.forEach(System.out::println);
    
    var List = new ArrayList<>();
    List.add("NY");
    List.add("SD");
    System.out.println(List);
    System.out.println(List.set(1,"DE"));

    Queue<Integer> queue = new LinkedList<>();
    System.out.println(queue.offer(10));
    System.out.println(queue.offer(4));
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.peek());
}    
}
