public class Persegi {
    int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void luasPersegi(){
        int luas = sisi*sisi;
    }
    public void kelilingPersegi(){
        int keliling = 2*(sisi+sisi);
    }
}
