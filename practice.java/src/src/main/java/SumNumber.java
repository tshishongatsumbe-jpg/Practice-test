import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.print("Enter number: ");
         number = scanner.nextInt();

        while (number != 0){
            sum += number;
            System.out.print("Enter number: ");
            number = scanner.nextInt();
        }
        System.out.println("Total sum: " + sum);
        scanner.close();

    }
}
