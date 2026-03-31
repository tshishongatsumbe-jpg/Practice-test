import java.util.Scanner;

/* 2. Password Checker (for loop + break): Write a Java program that asks for a password (max 3 attempts).
Use a for loop to check attempts. Break if correct password ("secret") is entered.
        - Demo:
        - Input: wrong
Input: wrong
Input: secret
Output: "Access granted!"
 */



public class Password3times {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secret = "secret";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Input: ");
            String input = scanner.next();

            if (input.equals(secret)) {
                System.out.println("Output: Access granted! ");
                break;
            }
        }scanner.close();

    }
}