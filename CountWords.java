import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountWords {
    public static void main(String[] args) throws IOException {
        int count=1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        reader.close();

        if (words.isBlank()) {
            count=0;
        } else {
            char last, current;
            last = words.charAt(0);

            for (int i=1;i<words.length();i++) {
                current=words.charAt(i);
                if (current==' '&&last!=' ') {
                    count++;
                }
                last=current;
            }
        }
        System.out.println(count);
    }
}