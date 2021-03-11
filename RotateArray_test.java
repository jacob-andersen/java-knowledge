import java.util.Scanner;

public class RotateArray_test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String array[] = (input.nextLine().split(" "));
        int rotations = input.nextInt();

        input.close();

        // the real coding starts!

        if (rotations >= array.length) {
            int actualRotations = rotations - ((array.length%rotations)*array.length);
        }

        String[] rotatedArray = new String [array.length];
       
        for (int i=0;i<rotations;i++) {
            rotatedArray[0]=array[array.length-1];
            for (int j=1;j<array.length;j++) {
            rotatedArray[j]=array[j-1];
        }
        array=rotatedArray.clone();
    }
    for (String elem : array) {
        System.out.print(elem + " ");
    }
    }
}