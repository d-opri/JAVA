import java.util.Scanner;

public class UMLBeispiel {
    public static void main(String[] args) {

        // 1.
        for (int i = 0; i <= 20; i++) {
            System.out.print("#");
        }
        for (int i = 0; i <= 20; i++) {
            System.out.println("#");
        }
        for (int i = 0; i <= 20; i++) {
            System.out.print("#  ");
        }

        // 2.
        int i = 0;
        while (i < 20) {
            System.out.print("#");
            System.out.println("#");
            System.out.print("#  ");
            i++;
        }

        // 3.
        int j = 0;
        do {
            System.out.print("#");
            System.out.println("#");
            System.out.print("#  ");
            j++;
        } while (j < 20);

        // 4.
        for (int k = 1; k <= 100; k++) {
            k = k + 1;
            System.out.print(k + ", ");
        }

        // 5.
        int a = 0;
        while (a < 1000) {
            if (a % 17 == 0) {
                System.out.print(a + ", ");
                a++;
            } else {
                a++;
            }
        }

        // 6. + 7.
        Scanner tastatur = new Scanner(System.in);
        int eingabe;

        for (int b = 0; b < 4; b++) {
            System.out.println("Bitte 1 - 3: ");
            eingabe = tastatur.nextInt();

            if (eingabe == 1) {
                System.out.println("Guten Morgen!");
            } else if (eingabe == 2) {
                System.out.println("Guten Tag!");
            } else if (eingabe == 3) {
                System.out.println("Guten Abend!");
            } else {
                System.out.println("Doof!");
            }

            // 7.
            switch (eingabe) {
                case 1:
                    System.out.println("Guten Morgen!");
                    break;
                case 2:
                    System.out.println("Guten Tag!");
                    break;
                case 3:
                    System.out.println("Guten Abend!");
                    break;
                default:
                    System.out.println("Doof!");
            }
        }

        tastatur.close();
    }
}
