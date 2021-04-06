public class FunWithDatatypes {
    public static void main(String[] args) {
        Integer a = 12;
        String s = "hello";
        System.out.println(Integer.toBinaryString(a));
        
        // When an expression starts with a string, everything that follows is converted to strings
        // This may result in undesirable results
        
        // "hello" + 3 + 5 is NOT going to show "hello8", but instead shows "hello35"

        System.out.println(s + 3 + 5);
    }
}
