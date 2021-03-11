public class Merge2SortedArrays {

    public static void main(String[] args) {
        
    
    int a = 4;
    int b = 3;
    int[] array1 = {1,2,3,4,0,0,0};
    int[] array2 = {1,2,3};
    int endIndex = array1.length-1;

    while (a>0 && b>0) {
        if (array1[a-1]>array2[b-1]) {
            array1[endIndex--]=array1[a-1];
            a--;
        } else {
            array1[endIndex--]=array2[b-1];
            b--;
            }

        }

        while (b > 0) {
            array1[endIndex--]=array2[b-1];
            b--;
        }
    for (int elem : array1) {
        System.out.print(elem+", ");
    }
}
}