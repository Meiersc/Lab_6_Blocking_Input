import java.util.Random;
import java.util.Scanner;
public class HighOrLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random integer between 1 and 10 (inclusive)
        int targetNumber = random.nextInt(10) + 1;
        int userGuess = 0;

        // Input validation loop
        do {
            System.out.print("Guess a number between 1 and 10 (inclusive): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Please enter a whole number: ");
                scanner.next();
            }
            userGuess = scanner.nextInt();
            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Out of range! Your guess must be between 1 and 10.");
            }
        } while (userGuess < 1 || userGuess > 10);

        // Display the computer's generated number
        System.out.println("The computer generated number was: " + targetNumber);

        // Check guess status
        if (userGuess < targetNumber) {
            System.out.println("Your guess was low!");
        } else if (userGuess > targetNumber) {
            System.out.println("Your guess was high!");
        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}
