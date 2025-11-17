package module4.time_date.tasks;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Task1 {
    public static void main(String[] args) {
        var date = getCurrenDate();
        var dateTime = getCurrentDateTime();
        var zonedDateTime = getCurrentZonedDate();
        var yearMonth = getCurrentYearMonth();
        var instant = getCurrentInstant();
        System.out.println("is Leap Date = " + date.isLeapYear());
        System.out.println("Date Time Formatted = " + dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd 'Hello pdp )'")));
        System.out.println("Zoned Date Time = " + zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd uuuu")));
        System.out.println("Current Year Month = " + yearMonth);
        System.out.println("Current Instant = " + instant.atZone(ZoneId.of("Asia/Tashkent")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd VV")));
    }

    public static LocalDate getCurrenDate() {
        return LocalDate.now();
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static ZonedDateTime getCurrentZonedDate() {
        return ZonedDateTime.now();
    }

    public static YearMonth getCurrentYearMonth() {
        return YearMonth.now();
    }

    public static Instant getCurrentInstant() {
        return Instant.now();
    }


}
