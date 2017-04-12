package ua.dp.mign.java8.time.adjusters;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.temporal.TemporalAdjusters.next;

public final class NextWorkingDayTest {
    @Test
    public void shouldSetTuesday() {
        NextWorkingDay adjuster = new NextWorkingDay();

        LocalDate monday = LocalDate.of(2017, 4, 10);
        LocalDate tuesday = monday.with(adjuster);

        Assert.assertEquals(monday.with(next(TUESDAY)), tuesday);
    }

    @Test
    public void shouldSetWednesday() {
        NextWorkingDay adjuster = new NextWorkingDay();
        LocalDate tuesday = LocalDate.of(2017, 4, 11);

        LocalDate wednesday = tuesday.with(adjuster);

        Assert.assertEquals(tuesday.with(next(WEDNESDAY)), wednesday);
    }

    @Test
    public void shouldSetThursday() {
        NextWorkingDay adjuster = new NextWorkingDay();
        LocalDate wednesday = LocalDate.of(2017, 4, 12);

        LocalDate thursday = wednesday.with(adjuster);

        Assert.assertEquals(wednesday.with(next(THURSDAY)), thursday);
    }

    @Test
    public void shouldSetFriday() {
        NextWorkingDay adjuster = new NextWorkingDay();
        LocalDate thursday = LocalDate.of(2017, 4, 13);

        LocalDate friday = thursday.with(adjuster);

        Assert.assertEquals(thursday.with(next(FRIDAY)), friday);
    }

    @Test
    public void shouldSetMonday() {
        NextWorkingDay adjuster = new NextWorkingDay();
        LocalDate friday = LocalDate.of(2017, 4, 14);

        LocalDate monday = friday.with(adjuster);

        Assert.assertEquals(friday.with(next(MONDAY)), monday);
    }
}