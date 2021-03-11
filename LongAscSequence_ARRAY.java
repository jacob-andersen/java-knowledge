import java.util.Scanner;

public class LongAscSequence_ARRAY {
    public static void main(String[] args) {
        
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        int [] array = {1,2,3,2,1};

        int length = 1;
        int longest = 1;

        // last = input.nextInt();
        // for (int i=1; i < n; i++)

        for (int i=0; i < array.length-1; i++) {

            // current = input.nextInt();
            // if (last < current) {
            //     length++;
            //     longest = (length >= longest) ? length : longest;
            //     last = current;
            //     System.out.println("Element : " + current + " Length : " + length + " Longest : " + longest);
            // } else {
            //     length = 0;
            //     last = current;
            // }
            System.out.println("Element : " + array[i] + " Length : " + length + " Longest : " + longest);

            if (array[i] < array[i+1]) {
                length++;
                longest = (length >= longest) ? length : longest;
            } else {
                length = 0;
            }

        }
        System.out.println(" Length : " + length + " Longest : " + longest);
    }
}