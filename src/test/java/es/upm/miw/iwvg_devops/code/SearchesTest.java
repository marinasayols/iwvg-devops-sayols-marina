package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(
                List.of(-0.2, -0.5),
                new Searches().findDecimalFractionByNegativeSignFraction()
                        .collect(Collectors.toList())
        );
    }
}
