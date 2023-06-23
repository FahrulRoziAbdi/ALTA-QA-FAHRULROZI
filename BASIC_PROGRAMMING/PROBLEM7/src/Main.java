public class Main {
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
    private static float Mean(float[]numbers){
        float hasilBilangan = 0;
        for (float number: numbers) {
            hasilBilangan = hasilBilangan + number;
        }
        float result = hasilBilangan/numbers.length;
        return result;
    }
}