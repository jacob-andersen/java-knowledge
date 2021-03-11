import java.util.Scanner;

public class NextEvenNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nextEvenNumber = input.nextInt();
        input.close();
        
        System.out.print("The next EVEN number after " + nextEvenNumber + " is : ");
        nextEvenNumber = (nextEvenNumber % 2 == 0) ? nextEvenNumber+2 : nextEvenNumber+1;
        System.out.print(nextEvenNumber);        
    }    
}