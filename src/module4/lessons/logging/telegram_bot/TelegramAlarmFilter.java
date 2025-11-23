package module4.lessons.logging.telegram_bot;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class TelegramAlarmFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        return Level.SEVERE.intValue() <= record.getLevel().intValue();
    }
}
