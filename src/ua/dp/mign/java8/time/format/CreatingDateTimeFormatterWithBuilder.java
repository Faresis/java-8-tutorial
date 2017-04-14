package ua.dp.mign.java8.time.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public final class CreatingDateTimeFormatterWithBuilder {
    public static void main(String[] args) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(".")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);


        LocalDate date = LocalDate.of(2014, 3, 18);
        String formatted = date.format(formatter);
        LocalDate parsed = LocalDate.parse(formatted, formatter);

        System.out.println("formatter: " + formatter);
        System.out.println("date: " + date);
        System.out.println("formatted: " + formatted);
        System.out.println("parsed: " + parsed);
    }
}
