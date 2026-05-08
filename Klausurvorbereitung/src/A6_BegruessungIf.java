public class A6_BegruessungIf {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int eingabe = i; // Testwerte 1–4

            if (eingabe == 1)
                System.out.println("Guten Morgen!");
            else if (eingabe == 2)
                System.out.println("Guten Tag!");
            else if (eingabe == 3)
                System.out.println("Guten Abend!");
            else
                System.out.println("Sie sind doof!");
        }
    }
}