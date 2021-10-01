package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {
    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(
                List.of(-0.2, -0.5),
                new Searches().findDecimalFractionByNegativeSignFraction()
                        .collect(Collectors.toList())
        );
    }

    @Test
    void testFindHighestFraction() {
        assertEquals(
                new Fraction(0, 0),
                new Searches().findHighestFraction()
        );
    }

    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(
                List.of("Blanco", "López"),
                new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                        .collect(Collectors.toList())
        );
    }
}
