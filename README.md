package userlogin;
import java.util.Scanner;
public class Userlogin {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Set the correct username and password
        String correctUsername = "clive";
        String correctPassword = "ethic123";

        // Allow the user three attempts
        for (int attempt = 1; attempt <= 3; attempt++) {
            // Accept username and password from the user
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            // Check if the entered credentials are correct
            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop if login is successful
            } else {
                System.out.println("Login failed. Please try again. Attempts left: " + (3 - attempt));
            }
        }

        // Close the scanner
        scanner.close();
    }
}
