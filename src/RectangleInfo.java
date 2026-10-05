import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double width = 0;

        do {
            System.out.print("Enter the length of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            length = scanner.nextDouble();
            if (length <= 0) {
                System.out.println("Length must be greater than 0.");
            }
        } while (length <= 0);

        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            width = scanner.nextDouble();
            if (width <= 0) {
                System.out.println("Width must be greater than 0.");
            }
        } while (width <= 0);

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("\n--- Rectangle Details ---");
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);


    }
}
