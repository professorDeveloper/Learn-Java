package module4.time_date;

import java.time.DayOfWeek;
import java.time.YearMonth;

public class AdditionalTypesExample {
    public static void main(String[] args) {
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            System.out.println(DayOfWeek.values()[i]);
        }
        YearMonth yearMonth = YearMonth.of(1995, 11);
        System.out.println(yearMonth);
    }
}
