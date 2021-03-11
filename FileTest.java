import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class FileTest {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            char[] text = new char[100];
            int numBytes = reader.read(text);
            System.out.println("Number of bytes : " + numBytes + " Text : "+ text.toString());
            
            for (int i = numBytes - 1; i > -1; i--) {
                if (text[i] != 0) {
                    System.out.print(text[i]);
                }
            }          
        }
    }
}