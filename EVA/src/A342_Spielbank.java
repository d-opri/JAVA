import java.util.Scanner;

public class A342_Spielbank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // EINGABE
        System.out.println("5 Euro Chips: ");
        int chip5 = scanner.nextInt();

        System.out.println("10 Euro Chips: ");
        int chip10 = scanner.nextInt();

        System.out.println("20 Euro Chips: ");
        int chip20 = scanner.nextInt();

        System.out.println("50 Euro Chips: ");
        int chip50 = scanner.nextInt();

        System.out.println("100 Euro Chips: ");
        int chip100 = scanner.nextInt();

        // VERARBEITUNG

        int gesamt = chip5 * 5 + chip10 * 10 + chip20 * 20 + chip50 * 50 + chip100 * 100;

        // AUSGABE
        System.out.println("Auszahlung: " + gesamt + " Euro");

        // System.out.print("Geben Sie Ihren Einsatz ein: ");
        // int einsatz = scanner.nextInt();

        // int chips100 = einsatz / 100;
        // einsatz = einsatz % 100;
        // int chips50 = einsatz / 50;
        // einsatz = einsatz % 50;

        // int chips20 = einsatz / 20;
        // einsatz = einsatz % 20;

        // int chips10 = einsatz / 10;
        // einsatz = einsatz % 10;

        // int chips5 = einsatz / 5;

        // int auszahlung = chips5 + chips10 + chips20 + chips50 + chips100;

        // System.out.println("Anzahl an 5 Euro Chips " + chips5);
        // System.out.println("Anzahl an 10 Euro Chips " + chips10);
        // System.out.println("Anzahl an 20 Euro Chips " + chips20);
        // System.out.println("Anzahl an 50 Euro Chips " + chips50);
        // System.out.println("Anzahl an 100 Euro Chips " + chips100);

        // System.out.println("Auszahlung " + auszahlung + "Chips");

        scanner.close();
    }
}