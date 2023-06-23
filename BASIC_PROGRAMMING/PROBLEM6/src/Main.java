public class Main {
    public static void main(String[] args) {
    DrawXYZ(3);
    DrawXYZ(5);
    DrawXYZ(1);


    }
    private static void DrawXYZ(int huruf) {
        int angka = 0;
        for (int a = 0; a < huruf; a++) {
            for (int b = 0; b < huruf; b++) {
                angka++;
                if (angka % 3 == 0) {
                    System.out.println("X");
                } else if (angka % 2 != 0) {
                    System.out.println("Y");
                } else if (angka % 2 == 0) {
                    System.out.println("Z");

                }
            }
            System.out.println();

        }
    }

}