public class ModuloFor {
    public static void main(String[] args) {
        int j = 14;
        j = j % 3;

        System.out.print(j);

        for (int i = j; i < 5; i++) {
            System.out.print(i);
        }
    }
}