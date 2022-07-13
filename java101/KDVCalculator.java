import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double product_price = input.nextDouble();

        double last_price = (product_price * 0.18) + product_price;

        System.out.println(last_price);

    }
}
