package bigClasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BigClassesObjectTest {

    @Test
    void test() {
        BigClasses bc = new BigClasses();
        double a = 0.06059, b = 0.070399;

        double actual = bc.wrongBigDecimal(a, b);
        double expected = bc.rightBigDecimal(a, b);
        System.out.println(expected);
        System.out.println(actual);

        assertEquals(expected, actual, 0);


    }

}
