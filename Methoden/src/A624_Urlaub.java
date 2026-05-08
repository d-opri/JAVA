import java.util.Scanner;

public class A624_Urlaub {
    public static void main(String[] args) {
        /*
         * Budget eingebebn
         * |
         * Reserve berechnen
         * |
         * While (nicht nachhause geshcickt)
         * - Land wählen
         * - Betrag eingeben
         * - Unter Reserve?
         * --Y: Einzahlung?
         * --N: Programm beenden
         * - Umrechnen
         * - Budget aktualisieren
         * |
         * ENDE
         * 
         */
        Scanner tastatur = new Scanner(System.in);

        double budget;
        double reserve;
        double verfuegbar;
        String land;
        double kurs;
        double euro;
        double wechselkurs;
        String waehrung;
        String antwort;
        double einzahlung;

        budget = eingabeDouble("Geben Sie Ihr gesamtes Reisebudget an: ", tastatur);
        reserve = budget * 0.10;
        verfuegbar = budget - reserve;

        System.out.printf("Ihre Reserve beträgt: %.2f Euro%n", reserve);

        while (true) {
            ausgabe("Welches Land wollen Sie auswählen?");
            ausgabe("D: Dänemark");
            ausgabe("E: England");
            ausgabe("J: Japan");
            ausgabe("S: Schweiz");
            ausgabe("U: USA");
            land = eingabeString("Eingabe: ", tastatur).toUpperCase();

            kurs = 0;
            waehrung = "";

            switch (land) {
                case "D":
                    kurs = 7.44;
                    waehrung = "DKK (Kronen)";
                    break;
                case "E":
                    kurs = 0.88;
                    waehrung = "GBP (Pfund)";
                    break;
                case "J":
                    kurs = 1.14;
                    waehrung = "JPY (Yen)";
                    break;
                case "S":
                    kurs = 0.96;
                    waehrung = "CHF (Franken)";
                    break;
                case "U":
                    kurs = 0.98;
                    waehrung = "USD (Dollar)";
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    continue;
            }

            while (true) {
                euro = eingabeDouble("Wie viele Euros wollen Sie umwechseln? ", tastatur);
                if (euro <= verfuegbar)
                    break;
                System.out.println("Sie haben nicht genug Budget, bitte einen kleineren Betrag eingeben.");
            }

            verfuegbar -= euro;
            wechselkurs = euro * kurs;
            System.out.printf("Sie erhalten %.2f %s%n", wechselkurs, waehrung);

            if (verfuegbar < reserve) {
                System.out.println("Sie fallen unter Ihre " + reserve + " Reserve");
                antwort = eingabeString("Wollen Sie mehr in Ihre Reisekasse einzahlen? (y/n)", tastatur);
                if (antwort.equalsIgnoreCase("y")) {
                    einzahlung = eingabeDouble("Geben Sie den Wert ein den Sie einzahlen möchten:", tastatur);
                    verfuegbar += einzahlung;
                    reserve = verfuegbar * 0.10;
                    System.out.printf("Neuer Reisekasse Wert: %.2f€ + %.2f€ (Reserve)%n%n",
                            verfuegbar, reserve);
                } else {
                    System.out.printf("Programm wurde beendet. Reserve: %.2f€%n", reserve);
                    break;
                }
            } else {
                System.out.printf("Ihr freies Reisebudget beträgt: %.2f€ + %.2f€(Reserve)%n%n", verfuegbar, reserve);
            }

        }
        tastatur.close();

    }

    public static String eingabeString(String text, Scanner tastatur) {
        System.out.print(text);
        return tastatur.next();
    }

    public static double eingabeDouble(String text, Scanner tastatur) {
        System.out.print(text);
        return tastatur.nextDouble();
    }

    public static void ausgabe(String text) {
        System.out.println(text);
    }
}
