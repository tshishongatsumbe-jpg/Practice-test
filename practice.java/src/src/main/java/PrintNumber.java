
/*1. Number Printer (for loop): Write a Java program that prints numbers from 1 to N (user input).
Use a for loop. Skip multiples of 5 using continue.
        - Demo:
        - Input: 10
Output: 1, 2, 3, 4, 6, 7, 8, 9
*/




import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int Nom;

        System.out.print("Enter number: ");
        Nom = scanner.nextInt();

        for (int i = 1; i < Nom; i++ ){
            if (i % 5 == 0){
                continue;
            }
            System.out.println(i + " ");

         }scanner.close();
    }
}

