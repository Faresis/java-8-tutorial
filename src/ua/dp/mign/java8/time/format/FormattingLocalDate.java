package ua.dp.mign.java8.time.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class FormattingLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, 3, 18);
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
    }
}
