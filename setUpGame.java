import java.util.*;

public class setUpGame {

    public static void main(String[] args) {   

    String Name;
    int Wallet = 1000;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("\n\nTime to start the Black Jack Game");
    System.out.println("---------------------------------");
    System.out.print("\n\nWhat is your name? ");
    Name = input.nextLine();
    System.out.print("\nAnd how much do you bet? ");
    int Bet = input.nextInt();
    System.out.println("\nYour name is " + Name + " and you are willing to bet $" + Bet);
    System.out.println("\nThis leaves you with $" + (Wallet-Bet) + " in your pocket.\n");

    }

}
