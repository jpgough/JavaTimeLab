package org.threeten.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;

import static java.time.DayOfWeek.*;
import static java.time.Month.*;

public class NextMartinLutherKingDayQuery implements TemporalQuery<LocalDate> {

    @Override
    public LocalDate queryFrom(TemporalAccessor temporal) {
        LocalDate date = LocalDate.from(temporal);
        LocalDate currentYearMLKDay = getMartinLutherKingDayForDateInYear(date.getYear());

        Period periodToCurrentYearMLKDay = Period.between(date, currentYearMLKDay);

        if(periodToCurrentYearMLKDay.isNegative() || periodToCurrentYearMLKDay.isZero()) {
            return getMartinLutherKingDayForDateInYear(date.getYear() + 1);
        } else {
            return currentYearMLKDay;
        }
    }

    private LocalDate getMartinLutherKingDayForDateInYear(int year ) {
        return LocalDate.of(year, JANUARY, 1)
                .with(TemporalAdjusters.dayOfWeekInMonth(3, MONDAY));
    }
}
