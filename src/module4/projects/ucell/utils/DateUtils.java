package module4.projects.ucell.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String format(LocalDateTime time) {
        return time.format(FORMATTER);
    }

    public static LocalDateTime parse(String s) {
        return LocalDateTime.parse(s, FORMATTER);
    }

    public static String now() {
        return LocalDateTime.now().format(FORMATTER);
    }
}
