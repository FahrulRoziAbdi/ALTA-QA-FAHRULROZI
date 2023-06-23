public class PersegiPanjang {
    int panjang;
    int lebar;
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void luasPersegiPanjang(int panjang, int lebar){
        int luas =panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah :"+luas);
    }
    public void kelilingPersegiPanjang(int panjang,int lebar){
        int keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang adalah :" + keliling);
    }

}
