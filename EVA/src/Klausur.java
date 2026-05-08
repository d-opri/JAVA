import java.util.Scanner;

public class Klausur {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        System.out.println("Gib die Länge ein: ");
        double lang = tastatur.nextDouble();
        System.out.println("Gib die Breite ein: ");
        double breit = tastatur.nextDouble();
        System.out.println("Gib die Höhe ein: ");
        double hoch = tastatur.nextDouble();
        System.out.println("Bis wohin soll gefüllt werden? (5 cm unterm Rand): ");
        double tief = tastatur.nextDouble();
        System.out.println("Wieviel kostet ein Sack Erde?");
        double preis = tastatur.nextDouble();

        double kastenVolumen = (lang * breit * (hoch - tief)) * 4;
        // System.out.println("Kasten" + kastenVolumen);
        double blumensack = 25 * 1000;
        // System.out.println("Sack" + blumensack);
        double füllen = kastenVolumen / blumensack;
        // System.out.println("Füllen" + füllen);
        double gesamterde = Math.ceil(füllen);
        // System.out.println("Module" + füllen);
        double gesamtkosten = gesamterde * preis;
        // System.out.println("Kosten" + gesamtkosten);

        System.out.printf("Es kostet dich %.2f Euro, vier Blumenkästen zu befüllen", gesamtkosten);

        tastatur.close();

    }
}
