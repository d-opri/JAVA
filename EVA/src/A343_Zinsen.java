import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Einzahlung in Euro: ");
        double einzahlung = scanner.nextDouble();

        System.out.println("Zinsen in Prozent: ");
        double zinssatz = scanner.nextDouble();

        System.out.println("Jahre: ");
        double jahre = scanner.nextDouble();

        double kapital = einzahlung * jahre;

        double verzinsteskapital = kapital + (einzahlung * Math.pow(1 + zinssatz / 100, jahre));
        // double verzinsteskapital = kapital + zinsezins;

        System.out.println("Investor hat insgesamt " + kapital + " Euro erhalten.");
        System.out.printf("Investor hat insgesamt %.2f", verzinsteskapital);
        System.out.print(" Euro erhalten (Mit Zinseszins)");
        scanner.close();
    }
}
