package ua.dp.mign.java8.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public final class CreatingZonedDateTime {
    public static void main(String[] args) {
        ZoneId rome = ZoneId.of("Europe/Rome");

        LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zonedDateTime1 = date.atStartOfDay(rome);

        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zonedDateTime2 = dateTime.atZone(rome);

        Instant now = Instant.now();
        ZonedDateTime zonedDateTime3 = now.atZone(rome);

        Instant instantFromDateTime = dateTime.toInstant(ZoneOffset.UTC);
        LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(instantFromDateTime, rome);

        System.out.println("rome : " + rome);
        System.out.println("zonedDateTime1 : " + zonedDateTime1);
        System.out.println("zonedDateTime2 : " + zonedDateTime2);
        System.out.println("zonedDateTime3 : " + zonedDateTime3);
        System.out.println("instantFromDateTime : " + instantFromDateTime);
        System.out.println("dateTimeFromInstant: " + dateTimeFromInstant);
    }
}
