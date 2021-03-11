import java.util.Scanner;

// utility class to encrypt and decrypt messages using a basic ceasar cypher
// the parameters asked for in the terminal are :
// enc (for ENCryption) or dec (for DECryption)
// next, input the text you want to encrypt/decrypt
// finally, input a positive number 1-26, you wish to
// use as an offset in the encryption/decryption process

// 
public class Encryption {

    final static String cypherKey = "abcdefghijklmnopqrstuvwxyz";
    static String text, operation;
    static String shiftedText = "";
    static int idxKey, shiftedIdx;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        operation = input.nextLine();
        text = input.nextLine();
        idxKey = input.nextInt();

        switch(operation) {
            case "enc": {
                System.out.println (Encrypt(text, idxKey));
                break;
            }
            case "dec": {
            System.out.println (Decrypt(text, idxKey));
            break;
        }
    }
    input.close();
}
    
    public static String Encrypt(String text, int key) {
        shiftedText="";
            for (int i = 0; i < text.length(); i++) {
                if (cypherKey.indexOf(text.charAt(i)) == -1) {
                    shiftedText += text.charAt(i);
                    continue;
                }
                shiftedIdx = (cypherKey.indexOf(text.charAt(i)) + key);
                if (shiftedIdx > cypherKey.length()-1) {
                    shiftedIdx = (cypherKey.indexOf(text.charAt(i)) + key - (cypherKey.length() - 1));
                    shiftedText += cypherKey.charAt(shiftedIdx - 1);
                } else {
                    shiftedText += (cypherKey.charAt(shiftedIdx));
                }
            }
            return shiftedText;
        }

    public static String Decrypt(String text, int key) {
        shiftedText="";
        for (int i = 0; i < text.length(); i++) {
            if (cypherKey.indexOf(text.charAt(i)) == -1) {
                shiftedText += text.charAt(i);
                continue;
            }
            shiftedIdx = (cypherKey.indexOf(text.charAt(i)) + key);
            if (shiftedIdx > cypherKey.length()-1) {
                shiftedIdx = (cypherKey.indexOf(text.charAt(i)) + key - (cypherKey.length() - 1));
                shiftedText += cypherKey.charAt(shiftedIdx - 1);
            } else {
                shiftedText += (cypherKey.charAt(shiftedIdx));
            }
        }
        return shiftedText;
    }
}