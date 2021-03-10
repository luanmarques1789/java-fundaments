package general;

public class AutoIncrement {
    public static void main(String[] args) {

        int a = 5, b = 10;
        // Pós-incremento
        int x = a++;
        // Pós-decremento
        int y = b--;

        System.out.printf("a = %d \nb = %d \nx = %d \ny = %d\n\n", a, b, x, y);

        a = 5;
        b = 10;
        // Pré-incremento
        x = ++a;
        // Pré-decremento
        y = --b;

        System.out.printf("a = %d \nb = %d \nx = %d \ny = %d", a, b, x, y);
    }
}
