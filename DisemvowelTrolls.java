public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemVowel("This website is for losers LOL!"));        
    }

    public static String disemVowel (String str) {
        String vowels = "aeiouAEIOU";
        String cleanString = "";
        for (int i=0;i<str.length()-1;i++) {
            if (vowels.indexOf(str.charAt(i))<0) {
                cleanString+=str.charAt(i);
            }
        }
        return cleanString;
    }
}
