import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int p = input.nextInt();
        int minNumPages = n/p;

        // less than 2 or bigger than length of book - 2 ? return 1 ELSE
        // process "no of pages" in 2 page blocks

        input.close();

        System.out.println("Number of pages in book      : " + n);
        System.out.println("Number of page to turn to    : " + p);
        System.out.println("Minimum number of page turns : " + minNumPages + "\n");
        
    }
}