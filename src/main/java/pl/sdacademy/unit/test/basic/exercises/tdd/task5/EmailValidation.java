package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import java.util.regex.Pattern;

public class EmailValidation {
    private final static String EMAIL_REGEX = "[A-Za-z0-9_.-]+\\@[a-z]+\\.[a-z]+"; // możecie sobie śmiało rozszczezyć regexa o kolejne przypadki

    public static boolean validate(String emailStr) {
        if(emailStr == null || emailStr.trim().isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        return pattern.matcher(emailStr).matches();
    }
}