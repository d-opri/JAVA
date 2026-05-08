
public class A731_Suche {
    public static void main(String args[]) {

        /*
         * Entwerfen Sie einen Algorithmus, welcher in einem gegebenen Array nach einem
         * bestimmten Wert sucht. Dieser ist vom Benutzer einzugeben. Nutzen Sie dafür
         * eine Schleife und beenden diese Schleife, sobald der Wert gefunden wurde.
         * Geben Sie aus, ob der Wert gefunden wurde.
         */

        boolean found = false;
        int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };

        for (int i = 0; i < zahlenArray.length; i++) {
            if (zahlenArray[i] == 2) {
                found = true;
                break;
            }
        }

        // int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3 };
        // for (int i = 0; i < zahlenArray2.length; i++) {
        // if (zahlenArray2[i] == 3) {
        // found = true;
        // break;
        // }
        // }

        if (found) {
            System.out.print("Gefunden");
        } else {
            System.out.print("Nicht gefunden");
        }
    }
}
