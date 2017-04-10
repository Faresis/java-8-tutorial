package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.LocalTime;

public final class ParsingLocalDateAndLocalTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2014-03-18");
        LocalTime time = LocalTime.parse("13:45:20");

        System.out.printf("Date %s, Time %s", date, time);
    }
}
