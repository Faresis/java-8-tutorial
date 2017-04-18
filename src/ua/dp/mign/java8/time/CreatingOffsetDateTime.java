package ua.dp.mign.java8.time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public final class CreatingOffsetDateTime {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.of("-05:00");
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, offset);

        System.out.println("offset: " + offset);
        System.out.println("dateTime: " + dateTime);
        System.out.println("offsetDateTime: " + offsetDateTime);
    }
}
