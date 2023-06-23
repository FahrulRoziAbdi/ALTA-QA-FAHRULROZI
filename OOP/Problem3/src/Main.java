public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan Angka pertama :");
//        double n = input.nextDouble();
//        System.out.println("Masukkan Angka Kedua :");
//        double p = input.nextDouble();

        Kalkulator kalkulator = new Kalkulator();
        Tambah tambah = new Tambah(3,4);
        Kurang kurang = new Kurang(15,4);
        Kali kali = new Kali(10,10);
        Bagi bagi = new Bagi(12,3);

        System.out.println("Hasil Penjumlahan :"+tambah.Penjumlahan());
        System.out.println("Hasil Pengurangan :"+kurang.Pengurangan());
        System.out.println("Hasil Perkalian :"+kali.Perkalian());
        System.out.println("Hasilk Pembagian :"+bagi.Permbagian());






    }
}