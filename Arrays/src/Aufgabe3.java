
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String args[]) {

        /*
         * Im Programm „Palindrom“ werden über die Tastatur 5 Zeichen eingelesen und in
         * einem
         * geeigneten Array gespeichert. Ist dies geschehen, wird der Arrayinhalt in
         * umgekehrter
         * Reihenfolge (also von hinten nach vorn) auf der Konsole ausgegeben.
         */
        Scanner scanner = new Scanner(System.in);

        char[] zeichen = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Zeichen:");
            zeichen[i] = scanner.next().charAt(0);
        }

        System.out.println("---------Tückwärts---------");
        for (int i = 4; i >= 0; i--) {
            System.out.println(zeichen[i]);
        }

        scanner.close();
    }
}
