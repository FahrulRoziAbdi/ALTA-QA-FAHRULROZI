public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));

    }

    private static boolean palindrome(String kata) {
        char[] array = kata.toCharArray();
        int x = 0;
        int y = array.length - 1;

        while (x > y) {
            if (array[x] != array[y]) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}