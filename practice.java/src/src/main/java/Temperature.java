import  java.util.Scanner;


public class Temperature {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter your Temperature: ");
        int temperature = scanner.nextInt();{

        if (temperature < 30 ){
            System.out.println("It's not hot today");
        }else {
            System.out.println("It's hot ");
        }scanner.close();
        }
    }
}