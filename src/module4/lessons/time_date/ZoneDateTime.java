package module4.lessons.time_date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(now.getZone().getDisplayName(TextStyle.FULL, Locale.CANADA));
    }
}
