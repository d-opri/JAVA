
import java.util.Scanner;

public class Volumen {

    static Scanner tastatur = new Scanner(System.in);

    public static void main(String[] args) {

        double a = eingabe("A: ");
        double b = eingabe("B: ");
        double c = eingabe("C: ");
        double h = eingabe("H: ");

        double wuerfel = rechteck(a);
        double quader = quader(a, b, c);
        double pyramide = pyramide(a, h);
        double kugel = kugel(a);

        System.out.print("-------------------------------\n");

        System.out.print(ausgabe("Würfel", wuerfel));
        System.out.print(ausgabe("Quader", quader));
        System.out.print(ausgabe("Pyramide", pyramide));
        System.out.print(ausgabe("Kugel", kugel));

        tastatur.close();

    }

    public static double eingabe(String text) {
        System.out.print(text);
        return tastatur.nextDouble();
    }

    public static double rechteck(double a) {
        return a * a * a;
    }

    public static double quader(double a, double b, double c) {
        return a * b * c;
    }

    public static double pyramide(double a, double h) {
        return (a * a * h) / 3;
    }

    public static double kugel(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static String ausgabe(String name, double volumen) {
        return String.format("%s: V = %.2f\n", name, volumen);
    }

}
