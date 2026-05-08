import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A75_ArrayList {
    public static void main(String[] args) {
        /*
         * Deklaration einer Liste vom Typ int, die mit 20 Zufallszahlen zwischen 1 und
         * 9 initialisiert wird.
         * Ausgabe der Liste.
         * Benutzereingabe, der Benutzer soll eine beliebige Suchzahl zwischen 1 und 9
         * eingeben.
         * Ausgabe, wie oft sich die Zahl in der Liste befindet.
         * Ausgabe aller Indices, an denen die Suchzahl auftritt.
         * Löschen aller Elemente der Liste, die die Suchzahl enthalten.
         * Ausgabe der Liste.
         * Einfügen einer 0 als neues Element hinter jeder 5 in der Liste.
         * Ausgabe der Liste.
         */
        Scanner tastatur = new Scanner(System.in);

        ArrayList<Integer> intListe = new ArrayList<Integer>();

        // Deklaration
        for (int i = 0; i < 20; i++) {
            intListe.add((int) (Math.random() * 9 + 1));
        }
        // Ausgabe
        System.out.println("Ausgabe: ");
        for (int element : intListe) {
            System.out.print(element + ",");
        }
        System.out.println(" \n");

        // Eingabe User
        System.out.println("Beliebige Zahl zwischen 1 und 9 eingeben: ");
        int eingabe = tastatur.nextInt();
        int vorkommen = 0;

        for (int i = 0; i < intListe.size(); i++) {
            // Suche Eingabe
            vorkommen = Collections.frequency(intListe, eingabe);

        }
        // Ausgabe Anzahl
        System.out.println(eingabe + " kommt " + vorkommen + " mal vor ^_^");

        tastatur.close();
    }
}
