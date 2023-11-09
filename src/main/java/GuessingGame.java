import java.util.Scanner;
import java.util.Random;

public class GuessingGame {



    static int previousGuessNumber = 0;
  // static int max = 5;
    public static void main(String[] args) {
        Random rand = new Random();
        int userGuess = rand.nextInt(5)+1;
        int attempts = 0;
        boolean isCorrect = false;

        System.out.println("print the no:" + userGuess);
        while (!isCorrect) {
            System.out.println("Enter your guess(1-5)");
            Scanner scanner = new Scanner((System.in));
            int playerguess = scanner.nextInt();

            if (playerguess == userGuess) {
                System.out.println("Correct guess!");
                System.out.println("Number of guesses before successfully guessing correctly " + attempts);
                System.out.println("Thank you for playing. Goodbye!");
                break;
            } else if ((userGuess <= 1) || (userGuess>= 5)) {
                System.out.println("Please enter the number 1-5 ");
            } else if (userGuess < playerguess) {
                System.out.println(("The number is too large"));
                attempts++;
            } else  {
                System.out.println("The number is too small");
            }
                attempts++;
            }
        }
    }



