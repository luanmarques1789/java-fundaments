package bigClasses;

import java.math.BigDecimal;

public class BigClasses {

    public double wrongBigDecimal(double a, double b) {
        double c = b - a;

        return c;
    }

    public double rightBigDecimal(double a, double b) {
        BigDecimal a1 = new BigDecimal(a + "");
        BigDecimal b1 = new BigDecimal(b + "");
        BigDecimal c1 = b1.subtract(a1);
        double c = Double.parseDouble(c1 + "");

        return c;

    }

}
