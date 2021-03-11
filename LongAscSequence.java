import java.util.Scanner;

public class LongAscSequence {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int length = 1;
        int longest = 0;
        int last = input.nextInt();
        
        for (int i=1; i < n; i++) {
            int current = input.nextInt();
            if (last < current) {
                length++;
                longest = (length >= longest) ? length : longest;
                last = current;
                System.out.println("Element : " + current + " Length : " + length + " Longest : " + longest);
            } else {
                length = 0;
                last = current;
            }
        }
        input.close();
        System.out.println(longest);
    }
}