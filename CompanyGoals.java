public class CompanyGoals {
    public static void main(String[] args) {
        double agencySize = 12205.68;
        double oneMonthArrears = 3488.56;
        double twoMonthArrears = 135.14;
        double arrearsGoal = 0.05*agencySize;
        double lapseGoal = 0.01*agencySize;
        double growthGoal = 0.03*agencySize;
        String arrearsMessage = "";
        String lapseMessage = "";
        arrearsMessage = (oneMonthArrears+twoMonthArrears/agencySize > arrearsGoal) ? "You need to improve your Arrears!" : "Your arrears are looking great!";
        lapseMessage = (lapseGoal < twoMonthArrears) ? "You need to improve your Lapse!" : "Your Lapse is looking great!";
        System.out.println(String.format("\nCurrent Arrears   :%-4.2f", (oneMonthArrears+twoMonthArrears/agencySize)));
        System.out.println(String.format("Arrears GOAL      : %-4.2f", arrearsGoal));
        System.out.println(String.format("Current Lapse     : %-4.2f", twoMonthArrears));
        System.out.println(String.format("Lapse GOAL        : %-4.2f", lapseGoal));
        System.out.println(String.format("Growth GOAL       : %-4.2f", growthGoal));
        System.out.println("\nCONCLUSION : \n");
        System.out.println(arrearsMessage);
        System.out.println(lapseMessage);

    }
    
}
