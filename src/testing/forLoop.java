package testing;

public class forLoop {
    public static void main(String[] args) {
        var dante = 64;
        var cont = 0;

        for (int i = 1; i <= dante; i++) {
            cont++;
            System.out.println(i);
        }

        System.out.printf("\ncont = %d", cont);

    }
}
