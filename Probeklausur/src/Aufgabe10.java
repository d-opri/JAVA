public class Aufgabe10 {

    public static void main(String[] args) {
        int b = 2;
        int c = fkt(5, b);
        System.out.println(c);
    }

    public static int fkt(int a, int b) {
        int tmp = a;
        return a + b + tmp;
    }
}