import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = input.nextDouble();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = input.nextDouble();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = input.nextDouble();

        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = input.nextDouble();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = input.nextDouble();

        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = input.nextDouble();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Bütün derslerinizin ortalaması: " + ort);
    }
}
