import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class FileTest2 {
    public static void main(String[] args) {
        String text = "a b c d";
        String[] newText = text.split("\\+s",0);
        int count = text.isBlank() ? 0 : text.length();
        System.out.println(count);       
    }
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.Reader;

// class Main {
//     public static void main(String[] args) throws Exception {
//         try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
//             // start coding here
            
//             int count = 0;
//             String text ="";
//             int currentChar = reader.read();

// while (currentChar != -1) {
//     text+=(char)currentChar;
//     currentChar = reader.read();
// }

// String newText = "";
// for (int i = 0; i < text.length() - 1; i++) {
//     if (text.charAt(i) !=' ')
//     {
//         newText+=(char)text.charAt(i);
//         }                
// }
// String[] spaces = newText.trim().split(" ",0);
// count = (spaces.length == 0 ? 0 : spaces.length);
// System.out.println(count);
// }
// }

// }