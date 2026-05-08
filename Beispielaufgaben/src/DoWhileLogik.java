public class DoWhileLogik {
    public static void main(String[] args) {
        int i = 4;
        int ergebnis = 5;

        do {
            if (i < 6)
                i++;
            else
                i = i + 2;

            ergebnis = ergebnis + 5;
        } while (i < 8);

        ergebnis++;
        System.out.println(ergebnis + " " + i);
    }
}