import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai Jari - jari : ");
        double jari = input.nextDouble();
        System.out.println("Masukkan nilai Tinggi : ");
        double tinggi = input.nextDouble();

        Tabung tabung = new Tabung(jari,tinggi);
        tabung.volumeTabung();
    }
}