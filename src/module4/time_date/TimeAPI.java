package module4.time_date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class TimeAPI {
    public static void main(String[] args) {
//        System.out.println(Instant.now().get(ChronoField.DAY_OF_MONTH));
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.isLeapYear());
        System.out.println(now.plusYears(3).isLeapYear());
        System.out.println(now.plusDays(22)); // now time -> 11.17.25 -> after 22 days -> 12.09.25

    }

}