import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String array[] = (input.nextLine().split(" "));
        int rotations = input.nextInt();

        input.close();

        // the real coding starts!

        // IF length of array % number of rotations = 0 and rotations > length of array
        // THEN return original array 
        // ELSE do rotation
        
        String[] result = array.clone();

        for (int i=0;i<rotations;i++) {
            result = rotate(result);
            for (String elem : result) {
                System.out.print(elem + " ");
            }
            System.out.println();
            }
        }

    public static String[] rotate (String[] array) {

        String[] rotatedArray = new String [array.length];

        rotatedArray[0]=array[array.length-1];
        
        for (int i=1;i<array.length;i++) {
            rotatedArray[i]=array[i-1];
        }
        return rotatedArray;
    }    
}