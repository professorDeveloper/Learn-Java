package module4.lessons.time_date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime dateTime =LocalDateTime.of(1995,1,25,6,30,10);

        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(dateTime,now);
        System.out.println(duration.toDays());
    }
}
