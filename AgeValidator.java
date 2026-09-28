import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your 4-digit Mobile Money PIN: ");

            if (input.hasNextInt()) {
                pin = input.nextInt();

                if (pin >= 1000 && pin <= 9999) {
                    isValid = true;
                } else {
                    System.out.println("PIN must be a 4-digit number.");
                }

            } else {
                System.out.println("Please enter numbers only.");
                input.next(); // Remove invalid input
            }
        }

        System.out.println("PIN accepted.");

        input.close();
    }
}