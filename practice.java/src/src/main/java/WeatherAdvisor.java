import java.util.Scanner;

public class WeatherAdvisor {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature ");
        int temperature  = scanner.nextInt();

        if (Math.max(temperature , 31) == temperature) {
            System.out.printf("Temperature : %d °C, Advice: It's hot\n", temperature);
        }else if (temperature >= 15){
            System.out.printf("Temperature : %d °C, Advice: It's mild.\n", temperature);
        }else {
            System.out.printf("Temperature : %d °C, Advice: It's cold.\n", temperature);
        }
        scanner.close();

    }
}
