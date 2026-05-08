public class Recursive {

    public static void main(String[] args) {
        System.out.println(f(12, 8));
        System.out.println(mystery(3, 2, 6));
    }
    //
    // Was wird kleiner? n | Was wird addiert? d | Wann stoppt es? n == 1
    // n: 3 a: 2 d: 6
    // 3 == 1 ? --> 3 - 1 = 2 --> 6 + mystery(2, 2, 6)
    // 2 == 1 ? --> 2 - 1 = 1 --> 6 + mystery(1, 2, 6)
    // 1 == 1 ? --> return a = 2
    // 6 + 6 + 2 = 14

    public static int mystery(int n, int a, int d) {
        if (n == 1) {
            return a;
        } else {
            return d + mystery(n - 1, a, d);
        }
    }

    // Was wird kleiner? n | Was wird addiert? k | Wann stoppt es? n == k
    // k: 12 n: 8
    // 8 > 12 ? --> 12 - 8 = 4 --> f(4, 8)
    // 8 < 12 ? --> 12 - 8 = 4 --> f(4, 8)
    // 4 == 4 ? --> return k = 4

    public static int f(int k, int n) {
        if (n == k) {
            return k;
        } else {
            if (n > k) {
                return f(k, n - k);
            } else {
                return f(k - n, n);
            }
        }
    }

}
