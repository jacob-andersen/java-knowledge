import java.util.Stack;

public class Matchingbrackets {
    public static void main(final String[] args) {

        final String bracketString = "";
        boolean balanced = true;
        char ch;

        // individual bracket counters
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;

        final Stack<Character> stack = new Stack<>();

        // is String empty or of an odd length? String is NOT balanced

        if (bracketString.length()%2!=0 || bracketString.isEmpty()){
            balanced=false;
        }

        // String is even length or contains characters ... it MAY be balanced
        
        for(int j=0;j<bracketString.length()&&balanced;j++) {
            
            // ch=stack.pop();
            ch = (char) bracketString.charAt(j);
                if(ch=='{') {
                    b1++;
                    stack.push(ch);
                } else if (ch=='(') {
                    b2++;
                    stack.push(ch);
                } else if (ch=='[') {
                    b3++;
                    stack.push(ch);
                } else if (ch=='}' && !stack.isEmpty()) {
                    if (b1 > 0) {
                    b1--;
                    stack.pop();
                    } else  {
                        balanced = false;
                        break;
                    }
                } else if (ch==')' && !stack.isEmpty()) {
                    if (b2 > 0) {
                        b2--;
                        stack.pop();
                    } else { 
                        balanced=false;
                        break;
                    }
                } else if (ch==']' && !stack.isEmpty()) {
                    if (b3 > 0) {
                        b3--;
                        stack.pop();
                    } else {
                        balanced=false;
                        break;
                    }
                }
        }

       // Traversal of string and push/pop of stack is completed. Does stack still contain elements? String is NOT balanced

       if(b1+b2+b3 != 0 || !stack.isEmpty()) {
           balanced=false;
       }
        System.out.println(balanced);
    }
}