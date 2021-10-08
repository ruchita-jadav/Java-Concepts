package com.github.java.concepts.basics.dateAndTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * only util & time package is considered
 */
public class GetPriorTIme {

    public static void main(String[] args) {
        System.out.println(new Date());
        usingCalendar();
        usingDate();
    }

    private static void usingDate() {
        // Using Java 8
        System.out.println(LocalDateTime.now().minusHours(1));

        Date oneHourBack = new Date(System.currentTimeMillis() - 3600 * 1000);
        System.out.println(oneHourBack);
        oneHourBack = new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(1));
        System.out.println(oneHourBack);
        /* always in UTC if not timezone set
            pacjava.time
         */
        Instant instant = Instant.now().minus(1, ChronoUnit.HOURS);
        // with timezone, Europe/Berlin for example
        ZonedDateTime zonedDateTime = Instant.now()
                .atZone(ZoneId.of("Asia/Kolkata"))
                .minusHours(1);
        System.out.println("instant :"+instant);
        System.out.println("zonedDateTime :"+zonedDateTime);
        oneHourBack = Date.from(instant);
        System.out.println("instant converted to Date :"+oneHourBack);
        oneHourBack = Date.from(zonedDateTime.toInstant());
        System.out.println("zonedDateTime converted to Date :"+oneHourBack);

    }

    private static void usingCalendar() {
        Calendar cal = Calendar.getInstance();
        // remove next line if you're always using the current time.
//        cal.setTime(date);
        cal.add(Calendar.HOUR, -1);
        Date oneHourBack = cal.getTime();
        System.out.println(oneHourBack);
    }
}
