package org.threeten.examples;

import org.junit.Before;
import org.junit.Test;

import java.time.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestSecondExamples {

    private SecondExamples samples;

    @Before
    public void before() {
        this.samples = new SecondExamples();
    }

    @Test
    public void test_is_today_after_tomorrow() {
        assertTrue(samples.isTodayAfterTomorrow());
    }

    @Test
    public void test_lastDayOfMonth() {
        assertEquals(DayOfWeek.FRIDAY, samples.getLastDayOfMonth());
    }

    @Test
    public void test_period_to_longest_day() {
        LocalDate now = LocalDate.now();
        LocalDate longestDay = LocalDate.now().with(Month.JUNE).withDayOfMonth(21);
        Period untilLongestDay = now.until(longestDay);
        assertEquals(untilLongestDay.getDays(), samples.howManyDaysUntilLongestDayOfTheYear());
    }

    @Test
    public void test_duration_to_new_year() {
        Duration duration = samples.howLongUntilNewYear();

        //print duration for example
        System.out.print(duration);
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime gmtNewYear = ZonedDateTime.of(2014, 12, 31, 23, 59, 59, 0, ZoneId.of("Europe/London"));

        //Left as an exercise for the user to inject a clock
        //assertEquals(Duration.between(now, gmtNewYear), duration);

    }

    @Test
    public void create_local_date_from_date() {
        assertEquals(LocalDate.now(), samples.createDateFromJavaUtilDate());
    }

    @Test
    public void test_days_of_month_in_year() {
        List<DayOfWeek> days = samples.lastDaysOfMonthsInYear(2014);

        days.stream().forEach(day -> System.out.println(day));

        List<DayOfWeek> answers = Arrays.asList(
                new DayOfWeek[]{DayOfWeek.valueOf("FRIDAY"),
                        DayOfWeek.valueOf("FRIDAY"),
                        DayOfWeek.valueOf("MONDAY"),
                        DayOfWeek.valueOf("WEDNESDAY"),
                        DayOfWeek.valueOf("SATURDAY"),
                        DayOfWeek.valueOf("MONDAY"),
                        DayOfWeek.valueOf("THURSDAY"),
                        DayOfWeek.valueOf("SUNDAY"),
                        DayOfWeek.valueOf("TUESDAY"),
                        DayOfWeek.valueOf("FRIDAY"),
                        DayOfWeek.valueOf("SUNDAY"),
                        DayOfWeek.valueOf("WEDNESDAY")
        });

        assertEquals(answers, days);
    }
}
