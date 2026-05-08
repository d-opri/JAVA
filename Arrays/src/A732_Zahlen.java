
public class A732_Zahlen {
    public static void main(String[] args) {

        /*
         * Entwerfen Sie einen Algorithmus, der die am häufigsten in einem Integer-Array
         * vorkommende Zahl ausgibt, sowie die Anzahl der Vorkommen.
         */

        int[] zahlen = { 3, 4, 2, 3, 5, 1, 2, 7, 2, 1, 2, 4 }; // Häufigste Zahl: 2 (4 Vorkommen)
        int count = 0;
        int maxZahl = 1;
        int haufigste = 0;

        for (int i = 0; i < zahlen.length; i++) {
            count = 0;
            for (int j = 0; j < zahlen.length; j++) {
                if (zahlen[i] == zahlen[j]) {
                    count++;
                }
            }
            if (count > maxZahl) {
                haufigste = zahlen[i];
                maxZahl = count;
            }
        }
        System.out.println("Häufigste Zahl: " + haufigste);
        System.out.println("Vorkommen: " + maxZahl);

    }
}
