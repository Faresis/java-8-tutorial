package ua.dp.mign.java8.time.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class CreatingCustomDateFormatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.of(2014, 3, 18);
        String formatted = date.format(formatter);
        LocalDate parsed = LocalDate.parse(formatted, formatter);

        System.out.println("formatter: " + formatter);
        System.out.println("date: " + date);
        System.out.println("formatted: " + formatted);
        System.out.println("parsed: " + parsed);
    }
}
