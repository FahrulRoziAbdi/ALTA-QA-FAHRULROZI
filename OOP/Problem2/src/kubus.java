public class kubus {
    int sisi;

    public kubus(int sisi) {
        this.sisi = sisi;
    }

    public void volumeKubus() {
        int volume = sisi*sisi*sisi;
        System.out.println("Nilai Volume :"+volume);
    }

    public void luasPermukaanKubus() {
        int luas = 6*(sisi*sisi);
        System.out.println("Nilai Luas Permukaan :"+luas);
    }
}
