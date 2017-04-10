package ua.dp.mign.java8.time;

import java.time.LocalTime;

public final class ReadingLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 45, 20);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.printf("Hour %s, minute %s, second %s", hour, minute, second);
    }
}
