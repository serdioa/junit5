package de.serdioa.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import de.serdioa.junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


public class JUnit5ParameterizedTest {

    private Calculator calc;


    @BeforeEach
    public void setUp() {
        this.calc = new Calculator();
    }


    @ParameterizedTest
    @ValueSource(doubles = {1.23, 2.34, 3.45})
    public void testAdd(double value) {
        this.calc.set(1.23);
        this.calc.add(value);

        assertEquals(1.23 + value, calc.get());
    }


    @ParameterizedTest
    @MethodSource("testAddParameterProvider")
    public void testAddWithExpected(double value, double expected) {
        this.calc.set(1.23);
        this.calc.add(value);

        assertEquals(expected, calc.get());
    }


    static Stream<Arguments> testAddParameterProvider() {
        return Stream.of(
                arguments(1.23, 1.23 + 1.23),
                arguments(2.34, 1.23 + 2.34),
                arguments(3.45, 1.23 + 3.45)
        );
    }
}
