public class Aufgabe12 {

    public static void main(String[] args) {
        boolean x = istWahr(true, false, true);
        System.out.println(x);
    }

    public static boolean istWahr(boolean a, boolean b, boolean c) {
        return (a && b) || (a && c) || (b && c);
    }
}