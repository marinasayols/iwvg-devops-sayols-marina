package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        List<Fraction> fractions = List.of(
                new Fraction(0, 1),
                new Fraction(2, 1)
        );
        user = new User("1", "Jane", "Doe", fractions);
    }

    @Test
    void testUserWithoutParameters() {
        user = new User();
        assertEquals(new ArrayList<>(), user.getFractions());
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Jane", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("John");
        assertEquals("John", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Roe");
        assertEquals("Roe", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(
                List.of(
                        new Fraction(0, 1),
                        new Fraction(2, 1)
                ),
                user.getFractions()
        );
    }

    @Test
    void testSetFractions() {
        user.setFractions(List.of(new Fraction(1, 1)));
        assertEquals(
                List.of(new Fraction(1, 1)),
                user.getFractions()
        );
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction(0, 0));
        assertEquals(
                List.of(
                        new Fraction(0, 1),
                        new Fraction(2, 1),
                        new Fraction(0, 0)
                ),
                user.getFractions()
        );
    }

    @Test
    void testFullName() {
        assertEquals("Jane Doe", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }
}

