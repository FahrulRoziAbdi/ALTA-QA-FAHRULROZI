import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input Alas : ");
        Scanner input = new Scanner(System.in);
        float alas = input.nextFloat();
        System.out.println("Input Tinggi : ");
        float tinggi = input.nextFloat();
        float luas=(alas*tinggi)/2;
        System.out.println("Hasilnya Nih Bro : " +luas);
        System.out.println("Coblos No. 01 ");
    }
}