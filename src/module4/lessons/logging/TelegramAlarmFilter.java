package module4.lessons.logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class TelegramAlarmFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
