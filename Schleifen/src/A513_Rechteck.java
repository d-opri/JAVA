import java.util.Scanner;

public class A513_Rechteck {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Geben Sie eine Seitenangabe ein: ");
        int seite = tastatur.nextInt();

        for (int i = 1; i <= seite; i++) {

            for (int x = 1; x <= seite; x++) {
                if (i == 1 || i == seite || x == 1 || x == seite) {
                    System.out.print("X ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    

        tastatur.close();
    }
}
