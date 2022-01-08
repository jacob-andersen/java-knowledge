import java.util.*;

public class Noduplicates {

    public static void main(String[] args) {
        String s = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
        String noDups = "";
        String[] tempString = s.split(" ");
        for (String elem : tempString) {
            if(!noDups.contains(elem)) {
                noDups += elem + " ";
            }
        }
        System.out.println(noDups.trim());
    }
}
