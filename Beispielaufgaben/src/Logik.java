public class Logik {
    public static void main(String[] args) {
        int x = 10, y = 5;
        char buchstabe = 'f';

        if (x > 9 || (y > 7 && buchstabe == 'f'))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}