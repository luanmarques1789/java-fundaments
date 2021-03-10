package bigClasses;

public class BigClassesObject {

    public static void main(String[] args) {
        BigClasses bc = new BigClasses();

        double a = 0.060, b = 0.0703;
        System.out.println("BigDecimal: ");
        System.out.println(bc.wrongBigDecimal(a, b));
        System.out.println(bc.rightBigDecimal(a, b));

    }

}
