package module4.lessons.logging;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class TelegramAlarmHandler extends StreamHandler {
    @Override
    public synchronized void publish(LogRecord record) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            String body = """
                    {
                        "chat_id": "%s",
                        "text": "%s"
                    }
                    """.formatted(Secrets.chatId, getFormatter().format(record));

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .uri(URI.create(Secrets.sendMessage))
                    .header("Content-Type", "application/json")
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return super.isLoggable(record);

    }
}
