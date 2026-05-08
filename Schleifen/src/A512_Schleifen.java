import java.util.Scanner;

public class A512_Schleifen {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        /*
         * Übung 1 ⭐
         * 
         * Das Programm soll die geraden Zahlen (2,4,6,...) ausgeben, bis sie ihr Alter
         * erreicht. Es könnte so aussehen:
         * 
         * Geben Sie bitte ihr Alter ein: 7
         * 2
         * 4
         * 6
         */

        System.out.println("Übung 1");

        System.out.print("Geben Sie bitte ihr Alter ein: ");
        int alter = tastatur.nextInt();

        for (int geradeZahl = 2; geradeZahl <= alter; geradeZahl += 2) {
            System.out.println(geradeZahl);
        }

        /*
         * Übung 2 ⭐⭐
         * 
         * Der Benutzer gibt 2 Zahlen ein. Das Programm gibt alle ungeraden Zahlen
         * zwischen den beiden aus. Es könnte so aussehen:
         * 
         * Eingabe von Zahl 1: 7
         * Eingabe von Zahl 2: 12
         * 9
         * 11
         */

        System.out.println("Übung 2");

        System.out.print("Eingabe von Zahl 1: ");
        int zahl1 = tastatur.nextInt();

        System.out.print("Eingabe von Zahl 2: ");
        int zahl2 = tastatur.nextInt();

        for (int ungeradeZahl = zahl1++; ungeradeZahl < zahl2; ungeradeZahl++) {
            if (ungeradeZahl % 2 != 0) {
                System.out.println(ungeradeZahl);
            }
        }

        /*
         * Übung 3 ⭐⭐⭐
         * 
         * Das Programm verwendet eine Schleife, um die Zahlen von 1 bis 12 zu
         * durchlaufen. Für jede Zahl soll das Programm eine Zeichenkette ausgeben, die
         * von der Teilbarkeit der Zahl abhängt:
         * 
         * Wenn die Zahl durch 3 teilbar ist, soll die Zeichenkette "---" ausgegeben
         * werden.
         * Wenn die Zahl durch 2 teilbar ist, aber nicht durch 3, soll die Zeichenkette
         * "--" ausgegeben werden.
         * Wenn die Zahl weder durch 2 noch durch 3 teilbar ist, soll die Zeichenkette
         * "-" ausgegeben werden.
         * 
         * Das Programm soll die Zahl und die entsprechende Zeichenkette in der Konsole
         * ausgeben.
         * 
         * Beispielausgabe:
         * 1-
         * 2 --
         * 3 ---
         * 4 --
         * 5 -
         */

        System.out.println("Übung 3");

        for (int zahl = 1; zahl <= 12; zahl++) {
            System.out.print(zahl);

            if (zahl % 3 == 0) {
                System.out.println(" ---");
            } else if (zahl % 2 == 0) {
                System.out.println(" --");
            } else {
                System.out.println(" -");
            }
        }

        // Übung Berechnung kleinster gemeinsamer Vielfaches, und größter gemeinsamer
        // Teiler ⭐⭐⭐⭐

        System.out.println("Übung 4");
        int a = 6;
        int b = 10;
        while (b != 0) {
            int z = b;
            b = a % b;
            a = z;
        }
        tastatur.close();
    }
}
