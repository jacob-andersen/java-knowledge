import java.util.stream.Stream;

public class StreamTest {
 
    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck","duck","duck","goose","people","people");
        s.filter(x -> x.length() > 4)
        .distinct()
        .forEach(System.out::println);
    }
}
