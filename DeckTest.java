import java.util.Stack;

// a small test class to print out all the cards in a deck complete with suit and rank

public class DeckTest {
    public static void main(String[] args) {
        
        Stack<Card> deck = Deck.makeDeck();
        int count = 1;

        while(!deck.isEmpty()) {
            Card newcard = deck.pop();

            System.out.println(count++ + " : " + (newcard.getCardValue(newcard)));
        }
    }
    
}
