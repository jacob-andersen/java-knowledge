import java.util.ArrayList;

public class GenericTypeTest {
    
    public static void main(String[] args) {
        GenericType<String> testType = new GenericType<String>("Hello World!");
        GenericType testType1 = new GenericType();
        GenericType<Integer> testType2 = new GenericType<Integer>(1257);
        
        System.out.println(testType.getType());
        System.out.println(testType1.getType());
        System.out.println(testType2.getType());
    }
}
