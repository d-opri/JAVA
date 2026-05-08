public class Aufgabe9 {
    public static void main(String[] args) {

        int[] nummern = { 2, 22, 5, 0, 6, 2 };
        int summe = 0;

        for (int i = 0; i < nummern.length; i++) {
            summe += nummern[i];
        }

        System.out.println("Summe: " + summe);
    }
}