package ua.dp.mign.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public final class UsingTemporalAdjusters {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2014, 3, 18);
        LocalDate date2 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate date3 = date2.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("date 1 : " + date1);
        System.out.println("date 2 : " + date2);
        System.out.println("date 3 : " + date3);
    }
}
