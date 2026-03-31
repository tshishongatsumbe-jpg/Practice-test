import java.util.Scanner;

public class BasicCalculator {
    public static void main (String[] args){
        /*System.out.print("Hello \n");
        System.out.println("Hello ");*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum: " + sum);

        int difference = number1 - number2;
        System.out.println("Difference: " + difference);

        int Product = number1 * number2;
        System.out.println("Product: " + Product);

        double Quotient = (double) number1 / (double) number2;
        System.out.println("Quotient: " + Quotient);

        scanner.close();

    }
}
