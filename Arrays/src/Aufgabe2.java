
public class Aufgabe2 {
    public static void main(String args[]) {

        /*
         * Das zu schreibende Programm „UngeradeZahlen“ ist ähnlich der Aufgabe 1. Sie
         * deklarieren
         * wiederum ein Array mit 10 Ganzzahlen. Danach füllen Sie es mit den ungeraden
         * Zahlen von 1 bis 19
         * und geben den Inhalt des Arrays über die Konsole aus (Verwenden Sie
         * Schleifen!)
         */

        int[] ungeradeZahlen = new int[10];
        int ungeradeZahl = 1;

        for (int i = 0; i < 10; i++) {
            ungeradeZahlen[i] = ungeradeZahl;
            ungeradeZahl += 2;
        }
        for (int i = 0; i < ungeradeZahlen.length; i++) {
            System.out.println(ungeradeZahlen[i]);
        }

    }
}
