/*
Name: Frank Gomes
Lab: Card Lab
Date: 12-10-19
Extra: Joker face
 */

import static java.lang.System.out;

public class CardRunner {
    public static void main(String[] args)
    {

		Card one = new Card(Suit.SPADES, Face.NINE);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card(Suit.DIAMONDS, Face.ACE);
		out.println(two);
		//two.setFace(Face.THREE);
		out.println(two);

		Card three = new Card(Suit.CLUBS, Face.FOUR);
		out.println(three);

		Card four = new Card(Suit.SPADES, Face.QUEEN);
		out.println(four);

		Card five = new Card(Suit.HEARTS, Face.QUEEN);
		out.println(five);

		Card six = new Card(Suit.DIAMONDS, Face.JOKER);
		out.println(six);
    }
}
