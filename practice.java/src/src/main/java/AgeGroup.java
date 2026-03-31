import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age: ");
        int age = scanner.nextInt();

        if (Math.min(age, 12) == age){
            System.out.printf("Age: %d, Group: Child \n ", age);
        }
        else if (age <= 19) {
            System.out.printf("Age: %d, Group: Teen \n ", age);

        }
        else{
            System.out.printf("Age: %d, Group: Adult \n ",age);
        }
        scanner.close();
    }

}
