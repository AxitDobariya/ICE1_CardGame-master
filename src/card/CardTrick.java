package card;

import java.util.Random;
import java.util.Scanner;

// Name: Axit Vipulbhai Dobariya
// Student ID: 991707553

/**
 * @modifier Axit Vipulbhai Dobariya
 * @author Axit Vipulbhai Dobariya
**/
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Random rand = new Random();

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Random suit index between 0 and 3
            magicHand[i] = c;
        }

        // Add one lucky card (2 of Clubs)
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit(Card.SUITS[2]); // 2 corresponds to Clubs
        magicHand[0] = luckCard;

        // Print the randomly generated cards
        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13) : ");
        int userValue = scanner.nextInt();

        System.out.print("Enter a suit (0-3 where 0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades) : ");
        int userSuit = scanner.nextInt();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        // Search for the user's card in magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
