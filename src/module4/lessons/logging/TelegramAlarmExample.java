package module4.lessons.logging;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class TelegramAlarmExample {
    static {
        var resource = TelegramAlarmExample.class.getClassLoader().getResource("logging.properties");
        System.setProperty("java.util.logging.config.file",
                resource.getFile());
    }

    private static Logger logger = Logger.getLogger(TelegramAlarmExample.class.getSimpleName());

    public static void main(String[] args) {
        Handler handler = new TelegramAlarmHandler();
        logger.addHandler(handler);
        if (new Random().nextBoolean()) {
            logger.severe("Error Message For Telegram");
        } else {
            logger.info("Info Message console file handlers");
        }
    }
}
