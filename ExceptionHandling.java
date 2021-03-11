import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String entry="";

        while (input.hasNext()) {
            try {
                entry = input.next();
                if (Integer.parseInt(entry) != 0) {
                System.out.println (Integer.parseInt(entry)*10);
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid user input: "+entry);
            }
}
}
}