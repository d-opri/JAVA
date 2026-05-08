
import java.util.Scanner;

public class A613_Rechner {
    public static void main(String[] args) {

        // Deklaration
        int x, y, m;

        hello();
        // (E) Eingabe
        // Werte für x und y festlegen:
        // ===========================

        x = eingabe("Bitte geben Sie die erste ganze Zahl ein: ");
        y = eingabe("Bitte geben Sie die zweite ganze Zahl ein: ");
        // (V) Verarbeitung
        // Addiere x und y
        // ================================
        m = berechnen(x, y);

        // (A) Ausgabe
        // Ergebnis auf der Konsole ausgeben:
        // =================================

        ausgabe(m, x, y);
    }

    public static void hello() {
        System.out.println("Willkommen zur Addition");
    }

    public static int eingabe(String text) {
        Scanner tastatur = new Scanner(System.in);
        System.out.println(text);
        tastatur.close();
        return tastatur.nextInt();
    }

    public static int berechnen(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public static void ausgabe(int ergebnis, int x, int y) {
        System.out.printf("%d + %d = %d\n", ergebnis, x, y);
    }
}