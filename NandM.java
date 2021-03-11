import java.util.HashSet;
import java.util.Set;

public class NandM {
    public static void main(String[] args) {
        int[] arr = new int[] {3,1,7,11};
        Set<Integer> set = new HashSet<Integer>(); 

        for (Integer element : arr) {
            if (set.contains(element*2) || (element % 2 == 0 && set.contains(element/2))) {
                System.out.print("TRUE!");
                System.exit(0);
            }
            set.add(element);
        }
        System.out.print("FALSE!");
    }
}
