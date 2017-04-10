package ua.dp.mign.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public final class ReadingLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014, 3, 18);
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int len = localDate.lengthOfMonth();
        boolean leapYear = localDate.isLeapYear();

        System.out.printf("year %s, month %s, dayOfMonth %s, dayOfWeek %s, length of month %s, is leap year %s",
                year, month, dayOfMonth, dayOfWeek, len, leapYear);
    }
}
