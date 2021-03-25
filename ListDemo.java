import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        String arraylist[] = new String[] { "a", "b", "c" };
        List<String> list = Arrays.asList(arraylist);

        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
