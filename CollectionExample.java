import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

    public static List<String> wordlist = new LinkedList<>();

    static {
        wordlist.add("Hello");
        wordlist.add("World");
    }

    public static void message() {
        System.out.println("Hello Java World");
    }

    public static void main(String[] args) {

        for (String elem : wordlist) {
            System.out.println(elem);
        }
        CollectionExample.message();
    }
}