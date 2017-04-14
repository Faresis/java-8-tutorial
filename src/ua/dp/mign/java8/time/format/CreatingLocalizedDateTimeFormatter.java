package ua.dp.mign.java8.time.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class CreatingLocalizedDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMANY);
        LocalDate date = LocalDate.of(2014, 3, 18);
        String formatted = date.format(formatter);
        LocalDate parsed = LocalDate.parse(formatted, formatter);

        System.out.println("formatter: " + formatter);
        System.out.println("date: " + date);
        System.out.println("formatted: " + formatted);
        System.out.println("parsed: " + parsed);
    }
}
