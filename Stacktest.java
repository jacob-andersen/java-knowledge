import java.util.Stack;

public class Stacktest {
    public static void main(String[] args) {

        String bracketString = "{}[)]";
    
        char ch;

        Stack stack = new Stack<>();

       

        // String is even length or contains characters ... it MAY be balanced
        
        for(int i=0;i<bracketString.length();i++) {
            
            ch = bracketString.charAt(i);
            stack.push(ch);
        }

        for(int i=0;i<bracketString.length();i++) {
            System.out.println(stack.pop());
        }
    }
}