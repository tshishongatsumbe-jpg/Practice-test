import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberPrinterForloop {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        for (int i = 1 ; i < input; i++){
            if (i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        scanner.close();
    }
}