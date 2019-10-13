/*
Name: Frank Gomes
Lab: Card Lab
Date: 12-10-19
Extra: Joker face
 */

// Possible faces for cards
enum Face {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER
}
// Possible suits for cards
enum Suit {
    SPADES, CLUBS, HEARTS, DIAMONDS, JOKER
}

public class Card {
    // Stats of the card
    private final Suit suit;
    private final Face face;
    // Constructor
    Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }
    // Getters
    Suit getSuit() {
        return suit;
    }
    Face getFace() {
        return face;
    }
    // toString
    public String toString() {
        if (face == Face.JOKER)
            return "" + face;
        return "" + face + " of " + suit;
    }
}