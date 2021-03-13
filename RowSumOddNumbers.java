        // A tree is made up of rows of ODD numbers, starting with 1.
        // each row increases by 1 number. Find the sum of all the numbers in a given row.
        // start 2 loops, the outer loop keeps count of the row number, and
        // the inner loop sums up the numbers in each individual row, using
        // the current count from the outer loop as the end count for the numbers.

public class RowSumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int row = 1;
        int number = 1;
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                if (i == row) {
                    sum+=number;
                }
                number+=2;
            }
        }
        System.out.println(sum);
    }
    
}
