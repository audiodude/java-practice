
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
        System.out.println("I've selected a number from 1 - 1000, try to guess it.");
        System.out.println("After each guess, I'll let you know if my number is lower or higher.");
        System.out.println("Enter your first guess to begin.\n");

        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 1000) + 1;

        while (true) {
            int number;
            System.out.print("> ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("That doesn't look like a number!");
                continue;
            }

            if (number < secretNumber) {
                System.out.println("Sorry, my number is higher");
            } else if (number > secretNumber) {
                System.out.println("Sorry, my number is lower");
            } else {
                // The guess wasn't higher or lower, so it's correct.
                System.out.println("You guessed it! The number was 50");
                break;
            }

            // TODO: Tell the user how many guesses afterwards.
            // TODO: Allow for a summary command.
        }

    }
}
