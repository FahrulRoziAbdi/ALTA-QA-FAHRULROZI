import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai panjang :");
        int panjang = input.nextInt();
        System.out.println("Masukkan nilai lebar :");
        int lebar = input.nextInt();
        System.out.println("masukkan nilai tinggi :");
        int tinggi = input.nextInt();


        Balok balok = new Balok(panjang,lebar,tinggi);
        balok.volumeBalok();
    }
}