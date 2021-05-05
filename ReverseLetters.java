// function takes a string, removes all non-alphabetic characters and reverses the resulting string.

public class ReverseLetters {
    public static void main(String[] args) {
        System.out.println(reverseLetters("ultr53o?n"));
    }

    public static String reverseLetters(final String str) {
        String cleanString = str.replaceAll("[^a-z]", "");
        String newString = "";
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            newString += cleanString.charAt(i);
        }
        return newString;
    }
}