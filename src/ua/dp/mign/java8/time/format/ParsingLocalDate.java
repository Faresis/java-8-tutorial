package ua.dp.mign.java8.time.format;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ParsingLocalDate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("date1 :" + date1);
        System.out.println("date2 :" + date2);
    }
}
