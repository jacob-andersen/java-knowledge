public class NestedClasses {
    // Inner class
    // Static nested class
    // Local class
    // Anonymous class ( = lambda expression)
    public static void main(String[] args) {
    StringBuilder one = new StringBuilder();
    StringBuilder two = new StringBuilder();
    StringBuilder three = one;
    System.out.println(one==two);
    }
}
