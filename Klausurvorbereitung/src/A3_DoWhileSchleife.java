public class A3_DoWhileSchleife {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.print("#");
            i++;
        } while (i < 20);

        System.out.println();
        i = 0;

        do {
            System.out.println("#");
            i++;
        } while (i < 20);

        i = 0;
        do {
            System.out.print("#  ");
            i++;
        } while (i < 20);
    }
}