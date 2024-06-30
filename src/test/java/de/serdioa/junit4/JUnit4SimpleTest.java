package de.serdioa.junit4;

import static org.junit.Assert.assertEquals;

import de.serdioa.junit.Calculator;
import org.junit.Before;
import org.junit.Test;


public class JUnit4SimpleTest {

    private Calculator calc;


    @Before
    public void setUp() {
        this.calc = new Calculator();
    }


    @Test
    public void testAdd() {
        this.calc.set(1.23);
        this.calc.add(4.56);

        assertEquals(1.23 + 4.56, this.calc.get(), Double.MIN_VALUE);
    }


    @Test
    public void testSubtract() {
        this.calc.set(1.23);
        this.calc.subtract(4.56);

        assertEquals(1.23 - 4.56, this.calc.get(), Double.MIN_VALUE);
    }


    @Test
    public void testMultiply() {
        this.calc.set(1.23);
        this.calc.multiply(4.56);

        assertEquals(1.23 * 4.56, this.calc.get(), Double.MIN_VALUE);
    }


    @Test
    public void testDivide() {
        this.calc.set(1.23);
        this.calc.divide(4.56);

        assertEquals(1.23 / 4.56, this.calc.get(), Double.MIN_VALUE);
    }
}
