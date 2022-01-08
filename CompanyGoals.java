public class CompanyGoals {
    public static void main(String[] args) {
        double agencySize = 12394.30;
        double oneMonthArrears = agencySize*0.2410;
        double twoMonthArrears = agencySize*0.0028;
        double arrearsGoal = 0.05*agencySize;
        double lapseGoal = 0.010*agencySize;
        double growthGoal = 0.03*agencySize;
        String arrearsMessage, lapseMessage;
        arrearsMessage = (oneMonthArrears+twoMonthArrears/agencySize > arrearsGoal) ? "You need to improve your Arrears!" : "Your arrears are looking great!";
        lapseMessage = (lapseGoal < twoMonthArrears) ? "You need to improve your Lapse!" : "Your Lapse is looking great!";
        System.out.println(String.format("\nCurrent Arrears   %5.2f", (oneMonthArrears+twoMonthArrears/agencySize)));
        System.out.println(String.format("Arrears GOAL       %5.2f", arrearsGoal));
        System.out.println(String.format("Current Lapse     %5.2f", twoMonthArrears));
        System.out.println(String.format("Lapse GOAL         %5.2f", lapseGoal));
        System.out.println(String.format("Growth GOAL        %5.2f", growthGoal));
        System.out.println("\nCONCLUSION : \n");
        System.out.println(arrearsMessage);
        System.out.println(lapseMessage);

    }
    
}
