import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi :");
        int sisi = input.nextInt();

        kubus kubus = new kubus(sisi);
        kubus.volumeKubus();
        kubus.luasPermukaanKubus();
        }
    }
