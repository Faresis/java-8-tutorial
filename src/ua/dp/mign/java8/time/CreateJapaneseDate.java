package ua.dp.mign.java8.time;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.util.Locale;

import static java.time.Month.MARCH;

public final class CreateJapaneseDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, MARCH, 18);
        JapaneseDate japaneseDate = JapaneseDate.from(date);

        Chronology chronology = Chronology.ofLocale(Locale.JAPAN);
        ChronoLocalDate chronoLocalDate = chronology.dateNow();

        System.out.println("date: " + date);
        System.out.println("japaneseDate: " + japaneseDate);
        System.out.println("chronology: " + chronology);
        System.out.println("chronoLocalDate: " + chronoLocalDate);
    }
}
