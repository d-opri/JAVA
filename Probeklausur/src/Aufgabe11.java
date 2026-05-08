public class Aufgabe11 {

    public static void main(String[] args) {
        System.out.println(sekunden(1, 3, 46, 40));
    }

    public static int sekunden(int tage, int stunden, int minuten, int sekunden) {
        return ((tage * 24 + stunden) * 60 + minuten) * 60 + sekunden;
    }
}