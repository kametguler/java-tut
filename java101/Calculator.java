import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n\nLütfen yapmak istediğiniz işlemi seçiniz: ");
        int selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Lütfen geçerli seçim yapınız!");
                break;
        }
    }
}
