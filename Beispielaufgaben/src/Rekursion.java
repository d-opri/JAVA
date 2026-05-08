public class Rekursion {

    public static void main(String[] args) {
        System.out.println(func(5));
    }

    public static long func(int n) {
        if (n > 0) {
            return n + func(n - 1);
        } else {
            return 0;
        }
    }
}