package org.threeten.examples;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestFormattingExample {

    private FormattingExamples formattingExamples;

    @Before
    public void before() {
        formattingExamples = new FormattingExamples();
    }

    @Test
    public void test_format_ISO_Date() {
        //Print out for examples sake.
        System.out.println(formattingExamples.formatSimpleDate());

        StringBuilder builder = new StringBuilder();
        LocalDate today = LocalDate.now();
        builder.append(today.getYear())
                .append("-");
        builder.append(formatSingleNumberWithTrailingZero(today.getMonthValue()));
        builder.append("-")
                .append(formatSingleNumberWithTrailingZero(today.getDayOfMonth()));
        assertEquals(builder.toString(), formattingExamples.formatSimpleDate());
    }

    @Test
    public void test_format_month_day_year() {
        //Print out for examples sake
        System.out.println(formattingExamples.formatMonthDayYear());

        LocalDate today = LocalDate.now();
        StringBuilder builder = new StringBuilder();
        builder.append(formatSingleNumberWithTrailingZero(today.getMonthValue()));
        builder.append("/").append(formatSingleNumberWithTrailingZero(today.getDayOfMonth()));
        builder.append("/").append(today.getYear());

        assertEquals(builder.toString(), formattingExamples.formatMonthDayYear());

    }

    @Test
    public void parseISODate() {
        assertEquals(LocalDate.of(2013,1,12), formattingExamples.parseLocalDate("2013-01-12"));
    }

    private String formatSingleNumberWithTrailingZero(int number) {
        StringBuilder builder = new StringBuilder();
        if(number < 10) {
            builder.append(0);
        }
        return builder.append(number).toString();
    }
}
