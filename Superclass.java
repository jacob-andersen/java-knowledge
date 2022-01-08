public class Superclass {
    static String message;
    Superclass(String message) {
        this.message = message;        
        System.out.println("Superclass() " + this.message);
    }
}