import java.util.Scanner;

public class AgeVerification {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age: ");
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("Access granted ");
        }else
            System.out.println("Access Dinied ");
    }
}
