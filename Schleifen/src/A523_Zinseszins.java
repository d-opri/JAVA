import java.util.Scanner;

public class A523_Zinseszins {
    public static void main(String[] args) {
        /*
         * Es ist ein Programm zu erstellen, mit dem das Endkapital eines Sparvertrages
         * berechnet werden kann. Es wird einmalig, zu Beginn des Sparvertrags, eine
         * bestimmte Kapitalsumme angelegt.
         * 
         * Der Sparvertrag läuft über eine bestimmte Anzahl von Jahren, die neben der
         * Anlagesumme und dem jährlichen Zinssatz vom Anwender einzugeben ist.
         * Anlagesumme und Zinssatz können Kommazahlen sein.
         * 
         * Am Ende eines Jahres werden die Zinsen dem jeweils vorhandenem Kapital
         * zugeschlagen. Im darauffolgenden Jahr wird das gesamte Kapital des Vorjahres
         * (also mit den im Vorjahr erhaltenen Zinsen: Zinseszinseffekt!) erneut
         * verzinst, usw.
         */

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Geben Sie die Laufzeit für den Vertrag: ");
        int jahre = tastatur.nextInt();

        System.out.print("Bitte geben Sie an, wie viel Kapital Sie anlegen: ");
        double anlageSumme = tastatur.nextDouble();

        System.out.print("Bitte geben Sie den Zinssatz an: ");
        double zinssatz = tastatur.nextDouble();

        double endKapital = anlageSumme;
        for (int jahr = 1; jahr <= jahre; jahr++) {
            endKapital += endKapital * (zinssatz / 100);
        }

        System.out.println();
        System.out.printf("Eingezahltes Kapital: %.2f Euro\n", anlageSumme);
        System.out.printf("Ausgezahltes Kapital: %.2f Euro\n", endKapital);

        tastatur.close();
    }
}
