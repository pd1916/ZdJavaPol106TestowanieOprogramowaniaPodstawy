package pl.sdacademy.unit.test.basic.exercises.tdd.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    /*
    test cases:
    * input = 0 -> result = 0
    * input = 1 -> result = 1
    * input = 4 -> result = 3
    * input = 6 -> result = 8
    * input = 8 -> result = 21
     */
    private static Fibonacci fibonacci;

    @BeforeAll
    static void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldReturnTheSameValueAsInput1() {
        //given
        int input = 0;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(input, result);
        assertThat(result).isEqualTo(input);
    }

    @Test
    void shouldReturnTheSameValueAsInput2() {
        //given
        int input = 1;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(input, result);
        assertThat(result).isEqualTo(input);
    }

    @Test
    void shouldReturnCorrectValue1() {
        //given
        int input = 4;
        int expectedResult = 3;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectValue2() {
        //given
        int input = 6;
        int expectedResult = 8;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectValue3() {
        //given
        int input = 8;
        int expectedResult = 21;
        //when
        int result = fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}