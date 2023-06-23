public class Tabung {
    double jari;
    double tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void volumeTabung() {
        double volume =3.14*jari*jari* tinggi;
        System.out.println("Nilai volume :" +volume);
    }
}
