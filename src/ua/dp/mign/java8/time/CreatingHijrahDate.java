package ua.dp.mign.java8.time;

import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public final class CreatingHijrahDate {
    public static void main(String[] args) {
        HijrahDate ramadan = HijrahDate.now().with(ChronoField.DAY_OF_MONTH, 1)
                .with(ChronoField.MONTH_OF_YEAR, 9);

        System.out.println("Ramadan starts on "
                + IsoChronology.INSTANCE.date(ramadan) +
                " and ends on " +
                IsoChronology.INSTANCE.date(
                        ramadan.with(TemporalAdjusters.lastDayOfMonth())
                )
        );
    }
}
