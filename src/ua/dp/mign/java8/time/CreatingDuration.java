package ua.dp.mign.java8.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public final class CreatingDuration {
    public static void main(String[] args) {
        LocalTime morning = LocalTime.of(10, 10, 10);
        LocalTime dinnerTime = LocalTime.of(13, 30, 10);

        Duration times = Duration.between(morning, dinnerTime);

        LocalDateTime yesterdaysMorning = LocalDateTime.of(2017, Month.APRIL, 9, 10, 10, 10);
        LocalDateTime todaysDinner = LocalDateTime.of(2017, Month.APRIL, 10, 13, 30, 10);

        Duration dates = Duration.between(yesterdaysMorning, todaysDinner);

        Instant i1 = Instant.ofEpochSecond(65);
        Instant i2 = Instant.ofEpochSecond(965);

        Duration instants = Duration.between(i1, i2);

        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeChronoMinutes = Duration.of(3, ChronoUnit.MINUTES);
        Duration sevenDays = Duration.ofDays(7);

        Temporal subtractedDateTime = Duration.ofDays(1).subtractFrom(LocalDateTime.now());

        System.out.println("Times: " + times);
        System.out.println("Dates: " + dates);
        System.out.println("Instants: " + instants);
        System.out.println("three minutes: " + threeMinutes);
        System.out.println("three chrono minutes: " + threeChronoMinutes);
        System.out.println("seven days: " + sevenDays);
        System.out.println("subtracted date time: " + subtractedDateTime);
    }
}
