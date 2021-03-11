import java.util.Arrays;
import java.util.Collections;

public class KthHighestElement {
    public static void main(String[] args) {
        Integer [] array = new Integer[] {99,98,97,96,95,94,3,2,21,45,43,22};
        int K = 1;
        Integer maxElement = 0;
        int counter = 0;

        Arrays.sort(array, Collections.reverseOrder());

        for (int i=1;i<array.length;i++) {
            if(array[i-1]!=array[i]&&counter<K) {
                maxElement=array[i-1];
                counter++;
            }
        }

        // for (int elem : array) {
        //     System.out.println(elem);
        // }
        System.out.println("Element : " + maxElement + " Counter : "+ counter);
    }
}
