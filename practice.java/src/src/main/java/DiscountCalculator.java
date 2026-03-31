import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter total prince: ");
        double price = scanner.nextDouble();

        double finalPrice = 0;
        String discountText = "";

        if ((price > 1000)) {
            discountText = "20%";
            finalPrice = price * 0.80;


        }
        else if (price > 500 && price < 1000) {
            discountText = "10%";
            finalPrice = price * 0.90;
        }
        else {
            discountText = "0%";
            finalPrice = price;
        }

            finalPrice = Math.round(finalPrice *100.0)/ 100.0;
            System.out.printf("Discount: %s, Final price: R%.2f\n", discountText, finalPrice);

            scanner.close();
    }
}
