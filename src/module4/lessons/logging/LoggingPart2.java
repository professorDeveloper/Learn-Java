package module4.lessons.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggingPart2 {
    static {
        initializeLogging();
    }

    public static void initializeLogging() {
        var resource = SimpleLoggingExample.class.getClassLoader().getResource("logging.properties");

        System.setProperty("java.util.logging.config.file",
                resource.getFile());
    }

    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.WARNING, "Hello PDP");
        logger.log(record);

    }
}
