public class IfElse {
    public static void main(String[] args) {
        int x = 5, y = 0;

        if (x < y && x % 2 == 1) {
            x = x * x;
        } else {
            x = 2 * x;
        }

        x++;
        System.out.println(x);
    }
}