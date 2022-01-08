// The Card class deals with all the parts necessary to build a single Card, such as suits, ranks
// and Card value.


public class Card {

    private Suit suit;
    private Rank rank;

    
    Card(Suit s, Rank r) {
        suit=s;
        rank=r;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
