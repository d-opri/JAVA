import java.util.Scanner;

public class A521_Addieren {
    public static void main(String[] args) {
        /*
         * Geben Sie in der Konsole die natürlichen Zahlen von 1 bis n aufzählend aus.
         * Ermöglichen Sie es dem Benutzer die Zahl n festzulegen. Addieren Sie alle
         * Werte.
         * Ändern Sie die Schleife, so dass diese herunterzählt.
         */

        Scanner tastatur = new Scanner(System.in);

        // Variante vorwärts
        System.out.println("Variante Vorwärts");
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        int endZahlVor = tastatur.nextInt();

        System.out.println();
        System.out.println("Die Zahlen werden addiert.");

        int summeVor = 0;
        for (int i = 1; i <= endZahlVor; i++) {

            System.out.println(i);
            summeVor += i;
        }

        System.out.println();
        System.out.println("Die Summe beträgt: " + summeVor);

        System.out.println();

        // Variante rückwärts
        System.out.println("Variante Rückwärts");
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        int endZahlBack = tastatur.nextInt();
        System.out.println();
        System.out.println("Die Zahlen werden addiert.");

        int summeBack = 0;
        for (int i = endZahlBack; i >= 1; i--) {
            System.out.println(i);
            summeBack += i;
        }

        System.out.println();
        System.out.println("Die Summe beträgt: " + summeBack);

        tastatur.close();
    }

}
