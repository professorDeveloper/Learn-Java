package module4.lessons.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SimpleLoggingExample {
    private static final Logger logger = Logger.getLogger("MyLogger");

    public static void main(String[] args) {
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        handler.setLevel(Level.INFO);

        handler.setFormatter(simpleFormatter);
        logger.log(Level.SEVERE, "This is an info message");
    }
}
