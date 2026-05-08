
public class Aufgabe4 {
    public static void main(String args[]) {

        /*
         * Jetzt wird Lotto gespielt. In der Klasse „Lotto“ gibt es ein ganzzahliges
         * Array, welches 6 Lottozahlen
         * von 1 bis 49 aufnehmen kann. Konkret sind das die Zahlen 3, 7, 12, 18, 37 und
         * 42. Tragen Sie diese im
         * Quellcode fest ein.
         * a) Geben Sie zunächst schleifenbasiert den Inhalt des Arrays in folgender
         * Form aus:
         * [ 3 7 12 18 37 42 ]
         * b) Prüfen Sie nun nacheinander, ob die Zahlen 12 bzw. 13 in der Lottoziehung
         * vorkommen.
         * Geben Sie nach der Prüfung aus:
         * Die Zahl 12 ist in der Ziehung enthalten.
         * Die Zahl 13 ist nicht in der Ziehung enthalten.
         */

        int[] lotto = { 3, 7, 12, 18, 37, 42 };

        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }

        boolean lotto12 = false;
        boolean lotto13 = false;

        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] == 12) {
                lotto12 = true;
            }
            if (lotto[i] == 13) {
                lotto13 = true;
            }
        }
        System.out.println(
                "Die Zahl 12 ist " + (lotto12 ? "in der Ziehung enthalten." : "nicht in der Ziehung enthalten."));
        System.out.println(
                "Die Zahl 13 ist " + (lotto13 ? "in der Ziehung enthalten." : "nicht in der Ziehung enthalten."));
    }
}
