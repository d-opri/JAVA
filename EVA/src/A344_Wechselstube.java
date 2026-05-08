import java.util.Scanner;

public class A344_Wechselstube {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wieviel Euro haben Sie?: ");
        int euro = scanner.nextInt();

        System.out.println("Wieviel Cent haben Sie?: ");
        int cent = scanner.nextInt();

        int centSumme = euro * 100 + cent;

        int euro2 = centSumme / 200;
        centSumme = centSumme % 200;

        int euro1 = centSumme / 100;
        centSumme = centSumme % 100;

        int cent50 = centSumme / 50;
        centSumme = centSumme % 50;

        int cent20 = centSumme / 20;
        centSumme = centSumme % 20;

        int cent10 = centSumme / 10;
        centSumme = centSumme % 10;

        int cent5 = centSumme / 5;
        centSumme = centSumme % 5;

        int cent2 = centSumme / 2;
        centSumme = centSumme % 2;

        int cent1 = centSumme / 1;
        centSumme = centSumme % 1;

        System.out.println("Sie bekommen " + centSumme + " cent als:");
        System.out.println(euro2 + " als 2 Euro Münzen");
        System.out.println(euro1 + " als 1 Euro Münzen");
        System.out.println(cent50 + " als 50 Cent Münzen");
        System.out.println(cent20 + " als 20 Cent Münzen");
        System.out.println(cent10 + " als 10 Cent Münzen");
        System.out.println(cent5 + " als 5 Cent Münzen");
        System.out.println(cent2 + " als 2 Cent Münzen");
        System.out.println(cent1 + " als 1 Cent Münzen");

        scanner.close();
    }
}
