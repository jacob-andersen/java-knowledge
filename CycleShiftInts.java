import java.util.Scanner;


// a very simple utility class to shift an array by one element

public class CycleShiftInts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] shiftedArray = new int[n];
        
        for (int i=1; i<n; i++) {
            shiftedArray[i]=input.nextInt();
            }
            shiftedArray[0]=input.nextInt();
            input.close();

            for (int x : shiftedArray) {
                System.out.print(x+" ");
            }
        }        
    }