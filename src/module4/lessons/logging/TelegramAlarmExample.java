package module4.lessons.logging;


import module4.lessons.logging.err.Err;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelegramAlarmExample {
    static {
        var resource = TelegramAlarmExample.class.getClassLoader().getResource("logging.properties");
        System.setProperty("java.util.logging.config.file",
                resource.getFile());
    }

    private static final Logger logger = Logger.getLogger(TelegramAlarmExample.class.getSimpleName());

    public static void main(String[] args) {
        try {
            if (new Random().nextBoolean()) throw new RuntimeException("Runtime Exception for testing");
            else {
                new Err().printErr();

            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Error Message", e);
        }
    }
}
