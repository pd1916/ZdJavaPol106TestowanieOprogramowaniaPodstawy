package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import java.util.Scanner;

public class StringUtil {

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}