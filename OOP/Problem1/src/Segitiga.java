public class Segitiga {
    int alas;
    int tinggi;
    int sisimiring1;
    int sisimiring2;

    public Segitiga(int alas, int tinggi, int sisimiring1, int sisimiring2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisimiring1 = sisimiring1;
        this.sisimiring2 = sisimiring2;
    }

    public void luasSegitiga(){
        int luasSegitiga = alas*tinggi/2;
        System.out.println("Luas Segitiga adalah :"+luasSegitiga);
    }
    public void kelilingSegitiga(){
        int kelilingSegitiga = alas+sisimiring1+sisimiring2;
        System.out.println("Keliling Segitigas adalah :"+kelilingSegitiga);
    }
}
