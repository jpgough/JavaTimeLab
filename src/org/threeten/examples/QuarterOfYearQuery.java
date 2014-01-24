package org.threeten.examples;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.*;


public class QuarterOfYearQuery implements TemporalQuery<Quarter> {

    @Override
    public Quarter queryFrom(TemporalAccessor temporal) {
        return null;
    }
}
