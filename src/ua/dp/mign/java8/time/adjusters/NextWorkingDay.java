package ua.dp.mign.java8.time.adjusters;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;
import static java.time.temporal.ChronoUnit.DAYS;

public final class NextWorkingDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        do {

            temporal = temporal.plus(1, DAYS);

        } while (temporal.get(DAY_OF_WEEK) > FRIDAY.getValue());

        return temporal;
    }
}
