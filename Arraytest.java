import java.util.ArrayList;
import java.util.List;

public class Arraytest {
    public static void main(String[] args) {

        int[] array1 = new int[] {1, 2, 3, 4};
        int[] array2 = new int[] {5, 6, 7, 8,9,10,11,12};
        int[] array3 = new int[array1.length+array2.length];

        for (int x=0;x<array3.length;x++) {
            if (x<array1.length) {
                array3[x]=array1[x];
            } else {
                array3[x]=array2[x-array1.length];
                        }
        }

        for (int elem :  array3) {
            System.out.print(elem + " ");
        }





}    
}
