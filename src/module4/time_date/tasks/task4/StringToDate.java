package module4.time_date.tasks.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    private final SimpleDateFormat formatter;

    public StringToDate(String pattern) {
        formatter = new SimpleDateFormat(pattern);
    }

    public Date getDate(String date) {
        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
