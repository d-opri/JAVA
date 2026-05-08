import java.util.Scanner;

public class A524_Matrix {
    public static void main(String[] args) {
        /*
         * Es soll eine Multiplikationsmatrix auf dem Bildschirm (von 10 Zeilen / 10
         * Spalten) angezeigt werden. Nach Eingabe einer Ziffer zwischen 2 und 9, z.B.
         * die 4, werden alle Zahlen durch einen Stern gekennzeichnet,
         * 
         * die diese Ziffer enthalten, z.B. die 14 oder 42
         * durch die eingegebene Zahl ohne Rest teilbar sind, z.B. die 8 oder 16
         * oder der Quersumme entsprechen, z.b. die 13 (1+3) oder 22 (2+2).
         * 
         * Tipp: Modulo ist ihr Freund.
         */

        Scanner tastatur = new Scanner(System.in);

        int ziffer;
        do {
            System.out.print("Bitte geben Sie eine Zahl zwischen 2 und 9 ein: ");
            ziffer = tastatur.nextInt();
        } while (ziffer < 2 || ziffer > 9);

        // Mattrix von 0 bis 99 (10 Zeilen, 10 Spalten)
        for (int zahl = 0; zahl <= 99; zahl++) {
            boolean markieren = enthaeltZiffer(zahl, ziffer)
                    || (zahl % ziffer == 0)
                    || (quersumme(zahl) == ziffer);

            if (markieren) {
                System.out.printf("%4s", "*");
            } else {
                System.out.printf("%4d", zahl);
            }

            // Zeilenumbruch nach jeweils 10 Zahlen
            if ((zahl + 1) % 10 == 0) {
                System.out.println();
            }
        }
        tastatur.close();
    }

    private static boolean enthaeltZiffer(int zahl, int ziffer) {
        return String.valueOf(zahl).contains(String.valueOf(ziffer));
    }

    private static int quersumme(int zahl) {
        int summe = 0;
        int n = zahl;

        if (n == 0)
            return 0;
        while (n > 0) {
            summe += n % 10;
            n /= 10;
        }
        return summe;
    }
}
