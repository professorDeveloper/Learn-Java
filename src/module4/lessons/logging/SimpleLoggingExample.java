package module4.lessons.logging;

import java.io.IOException;
import java.util.logging.*;

public class SimpleLoggingExample {

    static {
        try {
            var resource = SimpleLoggingExample.class
                    .getClassLoader()
                    .getResource("logging.properties");

            if (resource == null) {
                throw new IllegalStateException("logging.properties not found");
            }

            System.setProperty("java.util.logging.config.file",
                    resource.getFile());

            LogManager.getLogManager().readConfiguration();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) throws IOException {

        FileHandler fileHandler = new FileHandler("logs.log", false);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);

        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);

        printLogging();
    }

    private static void printLogging() {
        logger.info("Hello world");
        LogRecord record = new LogRecord(Level.INFO, "Hello again");
        record.setLoggerName(logger.getName());
        logger.log(record);
    }
}
