import java.util.Scanner;

public class A341_Rechteck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seite A (in cm): ");
        int seiteA = scanner.nextInt();

        System.out.println("Seite B (in cm): ");
        int seiteB = scanner.nextInt();

        int umfang = 2 * (seiteA + seiteB);
        int flaeche = seiteA * seiteB;

        System.out.println("Umfang = " + umfang + " cm");
        System.out.println("Fläche =" + flaeche + " cm^2");

        scanner.close();
    }
}
