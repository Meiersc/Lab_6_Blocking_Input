import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            gallonsInTank = scanner.nextDouble();
            if (gallonsInTank <= 0) {
                System.out.println("Gallons must be greater than 0.");
            }
        } while (gallonsInTank <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon (MPG): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            milesPerGallon = scanner.nextDouble();
            if (milesPerGallon <= 0) {
                System.out.println("Fuel efficiency must be greater than 0.");
            }
        } while (milesPerGallon <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: $");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Price must be greater than 0.");
            }
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / milesPerGallon) * pricePerGallon;
        double maxDistance = gallonsInTank * milesPerGallon;

        System.out.println("\n--- Calculation Results ---");
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance the car can go with a full tank: %.2f miles%n", maxDistance);


    }
}