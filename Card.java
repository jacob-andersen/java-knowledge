package Java_Knowledge;
public class Card {
    
// 2 enum classes for Suit and Rank respectively
// includes methods to determine rank and card value based on a card object
// in order to determine hand value and winner of game
    enum Suit {
        CLUBS("\u0005"), DIAMONDS("\u0004"), HEARTS("\u0003"), SPADES("\u0006");

    private String sign;

        private Suit(String sign) {
        this.sign = sign;
    }

    public String getSuit() {
        return this.sign;
    }
}

    enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10),
        ACE(11);
    
    private int value;
    
    private Rank(int value) {
            this.value = value;
        }
    
    public int getRank() {
            return this.value;
        }    
    }

    public Suit suit;
    public Rank rank;

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getCardValue (Card card) {
        return (card.suit.getSuit() + " " + card.rank.getRank());
    }
}