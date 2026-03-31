import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int enteredPin;

        do {
            System.out.print("Enter your 4 digits Pin " );
            enteredPin = scanner.nextInt();

            if (enteredPin !=  correctPin){
                System.out.println("Invalid pin. Try again");
            }

        }while (enteredPin !=  correctPin);
        System.out.println("PIN accepted!");
    }
}
        /* PIN Validator (do-while loop): Write a Java program that asks for a 4-digit PIN.
Use a do-while loop to keep asking until the correct PIN (1234) is entered. Print success message.
    - Demo:
        - Input: 1111
Output: "Invalid PIN. Try again."
        - Input: 1234
Output: "PIN accepted!"*/


