public class UnicodeToInteger {
    public static void main(String[] args) {
        String text = "Welcome to hyperskill!";
        String newString = "";
        int key = 5;

        for (int i=0;i<text.length();i++) {
            int charValue = (char)text.charAt(i);
            newString+=(char)(charValue+key);
            // System.out.print((char)(charValue+key));
        }
        System.out.println(newString);
    }
}