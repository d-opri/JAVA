
public class Test {

    public static void main(String[] args) {

        int[] zahlen = new int[20];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int) Math.pow(2, i);
        }

        for (int i = zahlen.length - 1; i >= 0; i--) {
            System.out.print(zahlen[i] + " ");
        }
    }
}
