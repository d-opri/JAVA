public class A1_ForSchleife {
    public static void main(String[] args) {

        // nebeneinander
        for (int i = 0; i < 20; i++) {
            System.out.print("#");
        }
        System.out.println();

        // untereinander
        for (int i = 0; i < 20; i++) {
            System.out.println("#");
        }

        // mit 2 Leerzeichen Abstand
        for (int i = 0; i < 20; i++) {
            System.out.print("#  ");
        }
    }
}