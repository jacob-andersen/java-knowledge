public class UnicodeEncryption {

    // final static String cypherKey = "abcdefghijklmnopqrstuvwxyz";
    static String text="";
    static String operation="enc";
     static String shiftedText;
     static int idxKey=0;
 
     public static void main(String[] args) {
        for(int i=0;i<args.length;i++ ) {
            if (args[i].equals("-mode")) operation = args[i+1];
            if (args[i].equals("-key")) idxKey = Integer.parseInt(args[i+1]);
            if (args[i].equals("-data")) text=args[i+1];
            System.out.println(i+ " " + args[i]);
        }

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
}
     
     public static String Encrypt(String text, int key) {
         shiftedText="";
             for (int i = 0; i < text.length(); i++) 
             {
                 int charValue = (char)text.charAt(i);
                 shiftedText+=(char)(charValue+key);
             }
             return shiftedText;
         }
 
     public static String Decrypt(String text, int key) {
         shiftedText="";
             for (int i = 0; i < text.length(); i++) 
             {
                 int charValue = (char)text.charAt(i);
                 shiftedText+=(char)(charValue-key);
             }
             return shiftedText;
         }
 }