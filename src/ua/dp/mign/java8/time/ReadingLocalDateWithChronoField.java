package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public final class ReadingLocalDateWithChronoField {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.get(ChronoField.YEAR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int dayOfMonth = now.get(ChronoField.DAY_OF_MONTH);

        System.out.printf("year %s, month %s, dayOfMonth %s", year, month, dayOfMonth);
    }
}
