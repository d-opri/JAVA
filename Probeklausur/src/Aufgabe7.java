public class Aufgabe7 {
    public static void main(String[] args) {

        int[] x = { 13, 9, -2 };
        double[] y = { 13.2, 9.4, -12.5, 3.2 };
        String[] z = { "Ente", "U-Boot", "Panama" };
        int[] n = new int[1000];

        // x[3] -> Fehlermeldung IndexOutOfBoundsException
        System.out.println(x[2] + ", " + y[2] + ", " + z[1] + ", " + n[187]);
    }
}