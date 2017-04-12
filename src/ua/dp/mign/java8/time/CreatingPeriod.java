package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.Period;

public final class CreatingPeriod {
    public static void main(String[] args) {
        Period dates = Period.between(LocalDate.of(2015, 6, 18), LocalDate.of(2014, 3, 8));

        System.out.println("dates " + dates);

        Period days = Period.ofDays(8);
        Period weeks = Period.ofWeeks(3);
        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);

        System.out.println("days " + days);
        System.out.println("weeks " + weeks);
        System.out.println("twoYearsSixMonthsOneDay " + twoYearsSixMonthsOneDay);
    }
}
