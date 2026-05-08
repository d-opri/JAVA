
public class Aufgabe1 {
    public static void main(String args[]) {

        /*
         * Schreiben Sie ein Programm „Zahlen“, in welchem ein ganzzahliges Array der
         * Länge 10
         * deklariert wird. Anschließend wird das Array mittels Schleife mit den Zahlen
         * von 0 bis 9
         * gefüllt. Zum Schluss geben Sie die Elemente des Arrays wiederum mit einer
         * Schleife auf der
         * Konsole aus.
         */
        int[] zahlen;
        zahlen = new int[10];

        for (int i = 0; i < 10; i++) {
            zahlen[i] = i;
        }
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

    }
}
