package module4.time_date;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        localDate();
    }

    private static void localDate() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.isLeapYear());
        System.out.println(now.plusYears(3).isLeapYear());
        System.out.println(now.plusDays(22)); // now time -> 11.17.25 -> after 22 days -> 12.09.25
    }

}