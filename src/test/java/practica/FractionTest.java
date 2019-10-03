package practica;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(10, 2);
    }

    @Test
    void testDecimal() {
        double respuesta = fraction.decimal();
        Assert.assertEquals(5.0, respuesta, 0);
    }

    @Test
    void testGetNumerator() {
        int numerator = fraction.getNumerator();
        Assert.assertEquals(10, numerator);
    }

    @Test
    void testGetDenominator() {
        int denominator = fraction.getDenominator();
        Assert.assertEquals(2, denominator);
    }

}