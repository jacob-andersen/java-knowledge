import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String numberString = input.next();
    input.close();
    
    int sumFirst=0;
    int sumLast=0;

    for (int i=0;i<numberString.length();i++) {
        char charValue = numberString.charAt(i);
        int intValue = Character.getNumericValue(charValue);
        
        if (i<3) {
            sumFirst+=intValue;
        } else {
            sumLast+=intValue;
        }
    }

   System.out.println(sumFirst == sumLast ? "Lucky" : "Regular");
 }
}