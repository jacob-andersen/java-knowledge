import java.util.Random;

public class Choice {
    public static void main(String[] args) {
        String[] studyArea = { "Front-end", "Back-end", "Front- and/or Back-end" };
        Random choice = new Random();
        System.out.println("You have been randomly selected to study " + studyArea[choice.nextInt(studyArea.length)]);
    }
}
