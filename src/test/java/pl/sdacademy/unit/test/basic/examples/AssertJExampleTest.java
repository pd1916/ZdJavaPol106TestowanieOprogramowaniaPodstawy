package pl.sdacademy.unit.test.basic.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertJExampleTest {

    @Test
    void assertJExample() {
        //given
        String input = "programowanie w javie";
        //then
        //assertj
        assertThat(input)
                .startsWith("programowanie")
                .contains(" ")
                .endsWith("javie");
        //junit
        assertTrue(input.startsWith("programowanie"));
        assertTrue(input.contains(" "));
        assertTrue(input.endsWith("javie"));
    }

    @Test
    void assertJExample2() {
        //given
        int[] ints = {1, 2, 3};
        //then
        //assertJ
        assertThat(ints)
                .hasSize(3)
                .contains(2, 3);
        // junit
        assertEquals(3, ints.length);
        assertEquals(2, ints[1]);
        assertEquals(3, ints[2]);
    }
}