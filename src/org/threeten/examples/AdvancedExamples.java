package org.threeten.examples;

import java.time.LocalDate;

public class AdvancedExamples {

    private final QuarterOfYearQuery quarterOfYearQuery = new QuarterOfYearQuery();

    private final NextMartinLutherKingDayQuery nextMartinLutherKingDayQuery = new NextMartinLutherKingDayQuery();


    public Quarter getQuarterOfYear(LocalDate date) {
        return date.query(quarterOfYearQuery);
    }

    public LocalDate getNextMartinLutherKingDay(LocalDate date) {
        return date.query(nextMartinLutherKingDayQuery);
    }
}
