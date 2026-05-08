
public class A734_SelectionSort {

    public static void main(String[] args) {
        /*
         * 
         * Der Index des kleinsten Wertes wird bestimmt.
         * Dieses kleinste Element wird mit dem ersten Element vertauscht (d.h. das
         * erste Element ist nun bereits das kleinste).
         * Danach wird, beginnend mit dem 2. Element, wiederum das Minimum bestimmt und
         * dieses Element mit dem 2. vertauscht (jetzt sind bereits zwei Elemente in der
         * richtigen Reihenfolge)
         * Die Minimum-Suche und das Vertauschen werden so lange wiederholt, bis das
         * vorletzte Element erreicht wurde (dieses kann dann ggf. mit dem letzten
         * Element vertauscht werden)
         * Danach ist das Array vollständig sortiert.
         * 
         * Programmieren Sie das Verfahren Selection-Sort so, dass das Array aufsteigend
         * sortiert wird.
         */

        int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
        int minIndex;
        int temp;

        for (int i = 0; i < liste.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < liste.length; j++) {
                if (liste[j] < liste[minIndex]) {
                    minIndex = j;
                }
            }
            temp = liste[i];
            liste[i] = liste[minIndex];
            liste[minIndex] = temp;
        }
        for (int i = 0; i < liste.length; i++) {
            System.out.print(liste[i]);
        }

    }
}
