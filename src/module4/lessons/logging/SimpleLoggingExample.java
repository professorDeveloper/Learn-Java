package module4.lessons.logging;

import java.util.logging.*;

public class SimpleLoggingExample {
    static  {
        String file = SimpleLoggingExample.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", file);
    }
    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.util.logging.config.file"));
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        handler.setFormatter(simpleFormatter);
        LogRecord logRecord = new LogRecord(Level.FINE, "Hello world");
        logger.log(logRecord);

    }
}
