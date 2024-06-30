package de.serdioa.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.serdioa.junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JUnit5SimpleTest {

    private Calculator calc;


    @BeforeEach
    public void setUp() {
        this.calc = new Calculator();
    }


    @Test
    public void testAdd() {
        this.calc.set(1.23);
        this.calc.add(4.56);

        assertEquals(1.23 + 4.56, this.calc.get());
    }


    @Test
    public void testSubtract() {
        this.calc.set(1.23);
        this.calc.subtract(4.56);

        assertEquals(1.23 - 4.56, this.calc.get());
    }


    @Test
    public void testMultiply() {
        this.calc.set(1.23);
        this.calc.multiply(4.56);

        assertEquals(1.23 * 4.56, this.calc.get());
    }


    @Test
    public void testDivide() {
        this.calc.set(1.23);
        this.calc.divide(4.56);

        assertEquals(1.23 / 4.56, this.calc.get());
    }
}
