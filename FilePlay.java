
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FilePlay {
    public static void main(String[] args) throws URISyntaxException {

        try {
            Path tempFile1 = Files.createTempFile("somePrefixOrNull", ".jpg");
            System.out.println("tempFile1 = " + tempFile1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}