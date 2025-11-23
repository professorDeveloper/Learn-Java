package module4.lessons.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggingPart2 {
    static {
        try {
            var resource = SimpleLoggingExample.class.getClassLoader().getResource("logging.properties");

            System.setProperty("java.util.logging.config.file",
                    resource.getFile());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        LogRecord record = new LogRecord(Level.INFO, "Hello PDP");
        logger.log(record);

    }
}
