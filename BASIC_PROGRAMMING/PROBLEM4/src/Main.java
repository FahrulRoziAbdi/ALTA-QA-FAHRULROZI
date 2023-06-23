public class Main {
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));

    }
    private static boolean primeNumber(int angka) {
    boolean bilangan = false;
    for (int i =2;i<=angka; i++){
        if (angka%i == 0 & i!=angka){
            return true;
        }
    }
    return bilangan;
    }
}
