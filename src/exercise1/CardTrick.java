package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * If the user's card is found in the hand, it invokes the printInfo() method.
 * To be used in Exercise 1.
 *
 * @author shahimoh
 * @date 2023-03-11
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card (value 1-13, suit 1-4):");
        int value = scanner.nextInt();
        int suit = scanner.nextInt();

        Card pickedCard = new Card();
        pickedCard.setValue(value);
        pickedCard.setSuit(Card.SUITS[suit - 1]);

        boolean found = false;
        for (Card card : hand) {
            if (card.equals(pickedCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your guess was incorrect.");
        }
    }

    /**
     * A simple method to print out personal information.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Mohammad Shahid, but you can call me Shahid.");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- To become the best computer programmer I can be.");
        System.out.println("-- To solve big computer related problems");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Learning new things.");
        System.out.println("-- Solving puzzles and riddles.");
        System.out.println("-- Listening to music.");
        System.out.println("-- Watching movies and TV shows.");

        System.out.println();
    }

}
