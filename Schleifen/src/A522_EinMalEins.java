public class A522_EinMalEins {
    public static void main(String[] args) {
        /*
         * Sie sollen ein Programm entwickeln, welches das kleine Einmaleins (1x1, 1x2
         * ... bis 10x10) auf dem Bildschirm ausgibt.
         */

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
    }
}
