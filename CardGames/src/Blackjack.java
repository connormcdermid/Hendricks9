/*
Name: Frank Gomes
Lab: Blackjack Lab
Date: 12-10-19
Extra: Playable blackjack
 */

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Blackjack {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner kbd = new Scanner(System.in);
        // Welcome prompt
        System.out.print("Welcome to Blackjack! Press Enter to start.");
        kbd.nextLine();
        System.out.println("----------");
        // List for dealer's hand of cards
        List<BCard> dealerHand = new java.util.ArrayList<>(Collections.emptyList());
        // List for player's hand of cards
        List<BCard> playerHand = new java.util.ArrayList<>(Collections.emptyList());
        // First deal
        playerHand.add(randomCard());
        playerHand.add(randomCard());
        // Dealer's first card
        BCard hidden = randomCard();
        dealerHand.add(randomCard());
        // Make sure dealer doesn't have blackjack on first deal
        while (hidden.value + dealerHand.get(0).value == 21)
            hidden = randomCard();
        // Sums of the dealer's & the player's hands
        int sum;
        int dealerSum;
        // Keep track of how many times the loop has gone through
        int run = 0;
        while (true) {
            // Show the user their cards
            System.out.println("Your cards:");
            for (BCard i : playerHand)
                System.out.println(i);
            // Show user dealer's cards
            System.out.println("Dealer's cards:");
            for (BCard i : dealerHand)
                System.out.println(i);
            // Check if user has blackjack or is over
            sum = 0;
            for (BCard i : playerHand)
                sum += i.value;
            if (sum == 21) {
                System.out.println("21! You win!");
                System.exit(0);
            }
            if (sum > 21) {
                System.out.println("You went over! You lose!");
                System.exit(0);
            }
            // Check if dealer has blackjack or is over
            dealerSum = 0;
            for (BCard i : dealerHand)
                dealerSum += i.value;
            if (dealerSum == 21) {
                System.out.println("Dealer has blackjack! You lose!");
                System.exit(1);
            }
            if (dealerSum > 21) {
                System.out.println("Dealer busts! You win!");
                System.exit(0);
            }
            // Check if user has higher card on run 2
            if (run == 2 && sum > dealerSum) {
                System.out.println("You have a higher hand than the dealer! You win!");
                System.exit(0);
            } else if (run == 2 && dealerSum > sum) {
                System.out.println("The dealer has a higher hand than you! You lose!");
                System.exit(1);
            }
            // Ask the user whether to hit or stand
            System.out.println("Hit or stand?");
            switch (toLowerCase(kbd.next().charAt(0))) {
                case 'h':
                    dealerHand.add(randomCard());
                    playerHand.add(randomCard());
                    break;
                case 's':
                    if (run == 0)
                        dealerHand.add(hidden);
                    if (run == 1)
                        dealerHand.add(randomCard());
                    break;
            }
            run++;
        }
    }

    // Random & method to generate random BCards
    private static Random rand = new Random();
    private static BCard randomCard() {
        // Generate random face
        Face face;
        switch (rand.nextInt(13)) {
            case 0:
                face = Face.ACE;
                break;
            case 1:
                face = Face.TWO;
                break;
            case 2:
                face = Face.THREE;
                break;
            case 3:
                face = Face.FOUR;
                break;
            case 4:
                face = Face.FIVE;
                break;
            case 5:
                face = Face.SIX;
                break;
            case 6:
                face = Face.SEVEN;
                break;
            case 7:
                face = Face.EIGHT;
                break;
            case 8:
                face = Face.NINE;
                break;
            case 9:
                face = Face.TEN;
                break;
            case 10:
                face = Face.JACK;
                break;
            case 11:
                face = Face.QUEEN;
                break;
            case 12:
                face = Face.KING;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rand.nextInt(13));
        }
        // Generate random suit
        Suit suit;
        switch (rand.nextInt(4)) {
            case 0:
                suit = Suit.DIAMONDS;
                break;
            case 1:
                suit = Suit.SPADES;
                break;
            case 2:
                suit = Suit.CLUBS;
                break;
            case 3:
                suit = Suit.HEARTS;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rand.nextInt(4));
        }
        // Return card with generated face & suit
        return new BCard(suit, face);
    }
}

// Card, but with a value
class BCard extends Card {
    // Value of the card
    final int value;
    // Constructor
    BCard(Suit suit, Face face) {
        super(suit, face);
        switch (face) {
            case ACE:
                value = 1;
                break;
            case TWO:
                value = 2;
                break;
            case THREE:
                value = 3;
                break;
            case FOUR:
                value = 4;
                break;
            case FIVE:
                value = 5;
                break;
            case SIX:
                value = 6;
                break;
            case SEVEN:
                value = 7;
                break;
            case EIGHT:
                value = 8;
                break;
            case NINE:
                value = 9;
                break;
            case TEN:
                value = 10;
                break;
            case JACK:
                value = 11;
                break;
            case QUEEN:
                value = 12;
                break;
            case KING:
                value = 13;
                break;
            default:
                value = 0;
        }
    }
}
