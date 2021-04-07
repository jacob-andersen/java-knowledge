public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // append method adds string to end of StringBuilder instance.

        sb.append("Hello");
        sb.append("World");
        
        // insert method inserts given string at index in StringBuilder instance.
        
        sb.insert(5, " ");


        System.out.println(sb);
    }
}
