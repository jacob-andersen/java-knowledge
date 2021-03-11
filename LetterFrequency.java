public class LetterFrequency {
    // find how often a letter appears in a string and print each letter out, followed by 
    // asterisks representing the number of times the letter appears
    // Chicago --> "c:**,h:*,i:*,a:*,g:*,o:*"
    public static void main(String[] args) {
        String city = "Chicago";

        double d = (short) 2.50256e2d; // d = 250
        char c = (short) 'd';          // c = 100
        short s = (short) 2.22;        // s = 2
        int i = 150000;        // i = 18928
        float f = 0.50f;       // f = 0
        double result = f + (i / c) - (d * s) - 500e-3;

        // result = f;
        System.out.println("result: " + result);

    }
    
}