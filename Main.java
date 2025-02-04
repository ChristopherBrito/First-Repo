//Christopher Brito
import java.util.Scanner;
import java.util.Random;

public class Main {
   
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

    while (playAgain) {
        int numberToGuess = random.nextInt(10) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to a Number Guessing Game!");
        System.out.println("What is a number between 1 and 10?");

    while (numberOfTries < 5 && !hasGuessedCorrectly) {
        System.out.print("Enter your guess: ");
        int userGuess = scnr.nextInt();
        numberOfTries++;

    if (userGuess < numberToGuess) {
        System.out.println("Too low, try again.");
        } else if (userGuess > numberToGuess) {
        System.out.println("Too high, try again.");
        } else {
        System.out.println("Congratulations! You've guessed the correct number.");
        hasGuessedCorrectly = true;
    }}

    if (!hasGuessedCorrectly) {
        System.out.println("You have used up all your guesses:(" +
        "\nThe correct number was " + numberToGuess);
    }

    System.out.print("Would you like to play again? (yes/no): ");
    String response = scnr.next();
    playAgain = response.equalsIgnoreCase("yes");
    }

    System.out.println("Thank you for playing!");
    
    }
}
