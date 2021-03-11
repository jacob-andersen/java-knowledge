import java.util.Arrays;

public class squareArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{-9,-2,0,2,3};
        
        // IntStream stream = Arrays.stream(arr);
        
        // stream.foreach(x -> System.out.println(x*x));
        
        
        
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);

            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);

        System.out.println();

        for (int elem : arr) {
            System.out.println(elem);
        }
    }    
}
