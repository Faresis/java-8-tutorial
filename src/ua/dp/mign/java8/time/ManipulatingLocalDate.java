package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public final class ManipulatingLocalDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        LocalDate date2 = date1.withYear(2011);
        LocalDate date3 = date2.withDayOfMonth(25);
        LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);

        System.out.println("date 1 : " + date1);
        System.out.println("date 2 : " + date2);
        System.out.println("date 3 : " + date3);
        System.out.println("date 4 : " + date4);

        LocalDate date5 = LocalDate.of(2014, 3, 18);
        LocalDate date6 = date5.plusWeeks(1);
        LocalDate date7 = date6.minusYears(3);
        LocalDate date8 = date7.plus(6, ChronoUnit.MONTHS);

        System.out.println("date 5 : " + date5);
        System.out.println("date 6 : " + date6);
        System.out.println("date 7 : " + date7);
        System.out.println("date 8 : " + date8);
    }
}
