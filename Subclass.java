// The superclass constructor is called by the JVM automatically when the subclass is initialized.
// this is shown by creating an instance of the sub class with a text message, and calling the super
// class constructor using part of the text the message supplied to the sub class constructor.

public class Subclass extends Superclass {
    String message;
    Subclass(String message) {
        super(message.substring(0, 5));
        System.out.println("Subclass() " + message);
    }

    public static void main(String[] args) {
        Subclass sc = new Subclass("hello there!");
    }
}
