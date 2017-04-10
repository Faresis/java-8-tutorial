package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public final class CreatingLocalDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        LocalTime time = LocalTime.of(13, 45, 20);
        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);
        LocalDate date1 = dt1.toLocalDate();
        LocalTime localTime = dt1.toLocalTime();

        System.out.printf("dt1 %s\n", dt1);
        System.out.printf("dt2 %s\n", dt2);
        System.out.printf("dt3 %s\n", dt3);
        System.out.printf("dt4 %s\n", dt4);
        System.out.printf("dt5 %s\n", dt5);
        System.out.printf("date1 %s\n", date1);
        System.out.printf("localTime %s\n", localTime);
    }
}
