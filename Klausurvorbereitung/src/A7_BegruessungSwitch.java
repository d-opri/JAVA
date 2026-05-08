public class A7_BegruessungSwitch {
    public static void main(String[] args) {

        int eingabe = 1;

        do {
            switch (eingabe) {
                case 1:
                    System.out.println("Guten Morgen!");
                    break;
                case 2:
                    System.out.println("Guten Tag!");
                    break;
                case 3:
                    System.out.println("Guten Abend!");
                    break;
                default:
                    System.out.println("Sie sind doof!");
            }
            eingabe++;
        } while (eingabe <= 4);
    }
}