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
        return null;
    }
}
