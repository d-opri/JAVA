public class Operatoren {
    public static void main(String[] args) {
        int j = 4;
        int i = 3;
        int result = 0;

        if (j < 5 && i > 5)
            result = j + i++;
        if (j < 5 || i < 5)
            result = j - i++;
        if (i > 3)
            result = 2 * j + i++;

        System.out.println(result);
    }
}