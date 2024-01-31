package userlogin;
import java.util.Scanner;
public class Userlogin {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        String correctUsername = "clive";
        String correctPassword = "ethic123"; 

        
        for (int attempt = 1; attempt <= 3; attempt++) {
            
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            
            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                System.out.println("Login successful!");
                break; 
            } else {
                System.out.println("Login failed. Please try again. Attempts left: " + (3 - attempt));
            }
        }

       
        scanner.close();
    }
}
