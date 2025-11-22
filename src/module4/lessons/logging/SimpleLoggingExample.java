package module4.lessons.logging;

import java.util.logging.*;

public class SimpleLoggingExample {
    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        handler.setLevel(Level.INFO);

        handler.setFormatter(simpleFormatter);
        LogRecord logRecord = new LogRecord(Level.INFO, "Hello world");
        logger.log(logRecord);

    }
}
