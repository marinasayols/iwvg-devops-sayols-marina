package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(2, 1);
    }

    @Test
    void testFractionWithoutParameters() {
        assertEquals(
                new Fraction(1, 1),
                new Fraction());
    }

    @Test
    void testGetNumerator(){
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void testSetNumerator(){
        fraction.setNumerator(3);
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testGetDenominator(){
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testSetDenominator(){
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(2.0, fraction.decimal());
    }
}
