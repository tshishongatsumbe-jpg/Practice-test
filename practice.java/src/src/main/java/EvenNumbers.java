/*
        3. Even Numbers (for loop + continue): Write a Java program that prints even numbers from 1 to N (user input).
Use a for loop and continue to skip odd numbers.
        - Demo:
        - Input: 8
Output: 2, 4, 6, 8
 */


import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++ ){

            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        scanner.nextInt();

    }


}
