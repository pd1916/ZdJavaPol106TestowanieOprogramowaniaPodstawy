package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    // true:
    // null
    // " "
    // "  "
    // ""

    // false
    // "null" -> "abc" ->  "123"
    // " a" -> "a " -> " a "

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //given
        String input = null;
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); // junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringIsSpace(){
/*        //given
        String input = " ";*/
        //when
        boolean result = StringUtil.isBlank(" ");
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfAfterTrimStringIsNotEmpty(){
        //given
        String input = " a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //junit
        assertThat(result).isFalse(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmpty2() {
        //given
        String input = "a";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmpty3() {
        //given
        String input = " a";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmpty4() {
        //given
        String input = "a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }


}