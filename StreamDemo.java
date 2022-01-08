import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jacob","Louis","Miriam","Hannah");

        List<String> result = names.stream().filter(name -> name.length() > 5).collect(toList());

        for(String elem : result) {
            System.out.println(elem);
        }
    }    
}
