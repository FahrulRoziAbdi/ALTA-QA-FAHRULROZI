import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai Ujian : ");
        int nilai = input.nextInt();
        if (nilai >100){
            System.out.println("Nilai yang Anda Input Invalid");
        }else {
            if (nilai >= 80) {
                System.out.println("Nilai Mahasiswa : " + nilai);
                System.out.println("Nilai Diperoleh : A");
            } else {
                if (nilai >= 65) {
                    System.out.println("Nilai Mahasiswa : " + nilai);
                    System.out.println("Nilai Diperoleh : B+");
                } else {
                    if (nilai >= 50) {
                        System.out.println("Nilai Mahasiswa : " + nilai);
                        System.out.println("Nilai Diperoleh : B");
                    } else {
                        if (nilai >= 35) {
                            System.out.println("Nilai Mahasiswa : " + nilai);
                            System.out.println("Nilai Diperoleh : C");
                        } else {
                            if (nilai >= 0) {
                                System.out.println("Nilai Mahasiswa : " + nilai);
                                System.out.println("Nilai Diperoleh : D");
                            } else {
                                if (nilai < 0) {
                                    System.out.println("Nilai yang Anda Input Invalid");
                                } 
                            }
                        }
                    }
                }
            }
        }



    }
}