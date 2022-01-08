public class ReplaceElementsRightSide {
    public static void main(String[] args) {
        int arr[] = { 17, 18, 5, 4, 6, 1 };
        int left = 0;
        
        // check elements to the right of the LEFT pointer
        // make note of the largest element
        // put that element at index[LEFT] and move on
        while (left < arr.length) {
            Integer largest = Integer.MIN_VALUE;
            for (int i = left; i < arr.length; i++) {
                if (largest<arr[i]) {
                    largest=arr[i];
                }
            }
            arr[left++]=largest;
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
