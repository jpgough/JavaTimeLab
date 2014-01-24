package org.threeten.examples;

import java.time.*;

public class FirstExamples {

    //Create a simple Date - Henry VIII Birthday - June 28th 1491
    public LocalDate getHenrysBirthday() {
        return LocalDate.of(1491, Month.JUNE, 28);
    }

    //Create a simple Time - 13:51
    public LocalTime getSampleLocalTime() {
        return LocalTime.of(13, 51);
    }

    //Create a sample LocalDateTime of the above
    public LocalDateTime getSampleLocalDateTime() {
        return LocalDateTime.of(1491, Month.JUNE, 28, 13, 51);
    }

    public LocalDateTime getComponentDateTime() {
        return LocalDateTime.of(getHenrysBirthday(), getSampleLocalTime());
    }

    public LocalDate getTodayFromLocalDateTime() {
        return LocalDateTime.now().toLocalDate();
    }

    public int getDifferenceBetweenParisAndLondon() {
        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        return paris.getHour() - london.getHour();
    }
}
