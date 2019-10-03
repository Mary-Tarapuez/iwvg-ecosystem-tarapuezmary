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

    @Test
    void testIsPropia() {
        boolean respuesta = fraction.isPropia();
        Assert.assertEquals(false, respuesta);
    }

    @Test
    void testIsImpropia() {
        boolean respuesta = fraction.isImpropia();
        Assert.assertEquals(true, respuesta);
    }

    @Test
    void testIsEquivalente() {
        fraction = new Fraction(5, 2, 10, 4);
        boolean respuesta = fraction.isEquivalente();
        Assert.assertEquals(true, respuesta);
    }

}