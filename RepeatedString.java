public class RepeatedString {
    public static void main(String[] args) {
        
    
    String a = "a";

    String infiniteString ="a";
    long n = 1000;

    int count = 0;
    String consideredLetters = "";

    long stringReps = n < (n/infiniteString.length()) * (n/infiniteString.length()) ? n+1 : n;

    if (n>infiniteString.length()) {
        for (int i=0;i<stringReps;i++) {
            consideredLetters+=infiniteString;
        }
    }

    consideredLetters = consideredLetters.substring(0,(int)n);

    for (char elem : consideredLetters.toCharArray()) {
        count = (a.indexOf(elem)!=-1) ? count+1 : count;  
    }

    System.out.println(infiniteString);
    System.out.println(consideredLetters);
    System.out.println(count);
    }
}

// find how many a's in the infinite String
// find how many times the string is repeated
// multiply the 2 and substract N from the number.