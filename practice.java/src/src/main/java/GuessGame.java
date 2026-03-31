import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempt = 0;
        int secretNumber = 7;
        int number = 0;

        System.out.print("Enter number: ");

        while (number != secretNumber) {
            number = scanner.nextInt();
            attempt++;

            if (number != secretNumber) {
                System.out.println("Try again");
                System.out.println("enter number between 1- 10");
            }
        }
        System.out.println("Correct! attempt: " + attempt);
        scanner.close();


    }
}