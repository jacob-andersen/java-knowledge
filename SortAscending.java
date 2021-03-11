import java.util.Arrays;
public class SortAscending {
    public static void main(String[] args) {
        int[] array = {1,2,10,50,5};
        Arrays.sort(array);
        for (int elem : array) {
            System.out.println(elem);
        }       
    }
}