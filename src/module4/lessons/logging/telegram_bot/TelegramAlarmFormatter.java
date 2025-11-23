package module4.lessons.logging.telegram_bot;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class TelegramAlarmFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String stackTrace = "";
        Throwable thrown = record.getThrown();
        if (thrown != null) {
            StringWriter writer = new StringWriter();
            thrown.printStackTrace(new PrintWriter(writer));
            stackTrace += writer.toString();
        }
        return """
                Level: %s
                Message: %s
                Time: %s
                Logger: %s
                Thread: %s,
                \nStackTrace: %s
                """.formatted(
                record.getLevel(),
                record.getMessage(),
                new java.util.Date(record.getMillis()),
                record.getLoggerName(),
                Thread.currentThread().getName(),
                stackTrace
        );
    }
}
