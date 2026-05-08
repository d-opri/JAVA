import java.util.Scanner;

public class Alter {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        /*
         * 1. Schreiben Sie ein Programm, das das Alter einer Person einliest und
         * basierend
         * auf dem Alter eine Altersklassifikation ausgibt. Die Kategorien sollen wie
         * folgt sein:
         * Kind: 0 bis 12 Jahre
         * Teenager: 13 bis 19 Jahre
         * Erwachsener: 20 bis 64 Jahre
         * Senior: 65 Jahre und älter
         * 
         * 
         * System.out.println("Dein Alter: ");
         * short alter = tastatur.nextShort();
         * 
         * if (alter >= 65) {
         * System.out.println("Di bist ein Senior");
         * } else if (alter >= 20) {
         * System.out.println("Du bist ein Erwachsener");
         * } else if ((alter <= 19) && (alter >= 13)) {
         * System.out.println("Du bist ein Teenager");
         * } else if (alter <= 12) {
         * System.out.println("Du bist ein Kind");
         * }
         */

        int zahl1 = 8, zahl2 = 4, zahl3 = 1, zahl4 = 0, zahl5 = 3, zahl6 = 12;

        System.out.println("Das Programm dividiert zwei ganze Zahlen und gibt das Ergebnis in der Konsole aus.");

        System.out.println("Erste Division: " + zahl1 / zahl2);
        System.out.println("Zweite Division: " + zahl2 / zahl3);
        System.out.println("Dritte Division: " + zahl2 / zahl1);
        System.out.println("Vierte Division: " + zahl2 / zahl4);
        System.out.println("Fuenfte Division: " + zahl1 / zahl5);
        System.out.println("Sechste Division: " + zahl6 / zahl2);
        tastatur.close();
    }
}
