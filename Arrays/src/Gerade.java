public class Gerade {
    public static void main(String[] args) {
        System.out.println("Hallo Welt!");

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
