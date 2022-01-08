import java.util.Arrays;

/* Given an array of candy prices and a fixed dollar amount, determine how many pieces of candy can be
   bought.

   1. Sort the array in ascending order
   2. Keep a running sum of candy prices added, as well as a counter of array items.
   3. Increase counter while sum is smaller than dollar amount available
   4. Once sum exceeds available money, return counter.

*/

public class CandyPriceCodeChallenge {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        int[] candyPrices = { 8, 4, 1, 3, 10, 11 };
        int amount = 25;

        Arrays.sort(candyPrices);

        for (int elem : candyPrices) {
            if (sum + elem < amount) {
                sum += elem;
                count++;
            } else {
                System.out.println(count);
                break;
            }
        }
    }
}