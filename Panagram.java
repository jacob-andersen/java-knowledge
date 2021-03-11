

public class Panagram {

    public static void main(String[] args) {
     
    int[] frequency = new int[26];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String sentence = "the quick brown fox jumps over the lazy dog";
    int count = 0;

    for(int i=0;i<sentence.length();i++) {
        if (alphabet.indexOf(sentence.charAt(i)) != -1) {
            frequency[alphabet.indexOf(sentence.charAt(i))] = 1;
        }
    }
        for (int elem : frequency) {
            count = (elem == 1) ? count+1 : count;  
        }
    System.out.println(count==alphabet.length());
    }
}
