public class Duplicates {
    public static void main(String[] args) {
        String sentence = "aaababaabababa";
        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.charAt(i) == sentence.charAt(i + 1)) {
                System.out.println(sentence.charAt(i));
            }
        }
    }
}