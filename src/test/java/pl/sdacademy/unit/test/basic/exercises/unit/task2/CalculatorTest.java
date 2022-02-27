package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoValues() {
        //given
        int firstDigit = 1;
        int secondDigit = 2;
        int expectedResult = 3;
        //when
        int result = calculator.add(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        int firstDigit = 1;
        int secondDigit = 2;
        int expectedResult = -1;
        //when
        int result = calculator.subtract(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //given
        int firstDigit = 2;
        int secondDigit = 3;
        int expectedResult = 6;
        //when
        int result = calculator.multiply(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldDivideTwoValues() {
        //given
        int firstDigit = 6;
        int secondDigit = 3;
        int expectedResult = 2;
        //when
        float result = calculator.divide(firstDigit, secondDigit);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}