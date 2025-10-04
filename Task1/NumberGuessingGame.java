import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // number between 1–100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nNew Round Started!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + attempts + " attempts.");
                    int roundScore = (maxAttempts - attempts + 1) * 10; // higher score for fewer attempts
                    totalScore += roundScore;
                    System.out.println("🎯 You earned " + roundScore + " points this round.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("⬆️ Too low, try again.");
                } else {
                    System.out.println("⬇️ Too high, try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The correct number was " + numberToGuess);
            }

            System.out.println("⭐ Current Total Score: " + totalScore);

            // Ask if user wants to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\n🏁 Game Over! Final Score: " + totalScore);
        scanner.close();
    }
}
