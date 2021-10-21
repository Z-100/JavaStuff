package learn.testing.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTests {

    private final Calculator myCalculator = new Calculator();

    @Test
    void add() {
        assertEquals(7, myCalculator.add(5, 2));
    }
}
