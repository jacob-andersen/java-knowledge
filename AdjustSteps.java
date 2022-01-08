public class AdjustSteps {

    int corrected(int steps) {
        if (steps < 0) {
            return 100 + steps;
        }
        return steps;
    }

    public static void main(String[] args) {
        AdjustSteps as = new AdjustSteps();

        int x = 98;
        int steps = 30;

        // Right
        System.out.print(" x + steps = ");
        System.out.println(as.corrected((x + steps) % 100));

        x = 0;
        steps = 30;
        // Left
        System.out.print(" x - steps = ");
        System.out.println(as.corrected((x - steps) % 100));
    }
}
