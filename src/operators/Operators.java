package operators;

public class Operators {

    public static void main(String[] args) {

        int i = 100;

        int k = (i > 50) ? 10 : 5; // if true, it returns 10, else 5
        System.out.println(k);

        char sex = 'm';
        String tit = (sex == 'f') ? "Sra." : "Sr.";
        System.out.println(tit);

    }

}
