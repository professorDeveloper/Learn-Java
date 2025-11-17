package module4.time_date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        LocalDate dateTime = LocalDate.of(1995, 1, 25);

        LocalDate now = LocalDate.now();
        Period duration = Period.between(dateTime, now);
        System.out.println(duration.getYears());
    }
}
