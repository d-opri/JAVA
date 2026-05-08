import java.util.Scanner;

public class A525_Treppe {
    public static void main(String[] args) {
        /*
         * Schreiben Sie ein Programm, das eine Treppe aus h Stufen einer bestimmten
         * Breite b in der folgenden Form zeichnet (Ausgabe von Leerzeichen und "*" auf
         * der Konsole):
         * 
         * Nutzen Sie Schleifen. Nur durch Änderung von Treppenhöhe und Treppenform soll
         * die Treppenform angepasst werden.
         */
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Treppenhöhe: ");
        int hoehe = tastatur.nextInt();

        System.out.print("Stufenbreite: ");
        int breite = tastatur.nextInt();

        System.out.println();
        for (int stufe = 1; stufe <= hoehe; stufe++) {
            // Schleife für Leerzeichen
            for (int space = 1; space <= (hoehe - stufe) * breite; space++) {
                System.out.print(" ");
            }

            // Schleife für Sterne
            for (int star = 1; star <= stufe * breite; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        tastatur.close();
    }
}
