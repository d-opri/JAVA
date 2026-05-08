
public class Multi {

    public static void main(String[] args) {

        double a = 2.36;
        double b = 7.87;

        double erg = multiplizieren(a, b);
        ausgabe(a, b, erg);
    }

    public static double multiplizieren(double a, double b) {
        return a * b;
    }

    public static void ausgabe(double a, double b, double e) {
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, e);
    }
}
