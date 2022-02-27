package pl.sdacademy.unit.test.basic.exercises.tdd.task6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {

    @Test
    void shouldRemoveAllDuplicates() {
        //given
        String[] input = {"Java", "Python", "Java", "C", "C#", "C"};
        String[] expectedResult = {"Java", "Python", "C", "C#"};
        //when
        String result[] = ArrayUtil.removeDuplicates(input);
        //then
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }
}