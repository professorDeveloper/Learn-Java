package module4.lessons.logging;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramAlarmHandler extends StreamHandler {
    public TelegramAlarmHandler() {
        super.setFilter(new TelegramAlarmFilter());
        super.setFormatter(new TelegramAlarmFormatter());
    }

    @Override
    public synchronized void publish(LogRecord record) {
        if (isLoggable(record)) {
            try {
                HttpClient client = HttpClient.newHttpClient();
                String formattedMessage = getFormatter().format(record);
                String body = """
                        {
                            "chat_id": "%s",
                            "text": "%s"
                        }
                        """.formatted(Secrets.chatId, formattedMessage);

                HttpRequest request = HttpRequest.newBuilder()
                        .POST(HttpRequest.BodyPublishers.ofString(body))
                        .uri(URI.create(Secrets.sendMessage))
                        .header("Content-Type", "application/json")
                        .build();
                client.send(request, HttpResponse.BodyHandlers.ofString());

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return getFilter().isLoggable(record);

    }
}
