package module4.projects.calendar_app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarApp {
        public static final String RESET = "\033[0m";
        public static final String RED_BRIGHT = "\033[0;91m";
        public static final String CYAN_BRIGHT = "\033[0;96m";

        public static void main(String[] args) {
            LocalDate dateTime = LocalDate.now();
            printCalendar(dateTime);
        }

        private static void printCalendar(LocalDate dateTime) {
            Month month = dateTime.getMonth();
            int year = dateTime.getYear();
            System.out.printf("%s%s %d %s%n", CYAN_BRIGHT, month, year, RESET);
            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                System.out.printf("%s%s%s \t", CYAN_BRIGHT, dayOfWeek.toString().substring(0, 2), RESET);
            }
            System.out.println();
            int days = month.length(dateTime.isLeapYear());
            int firstDay = dateTime.getDayOfWeek().getValue() - 1;
            for (int i = 1; i <= firstDay; i++) {
                System.out.printf("\t");
            }
            LocalDate curr = LocalDate.now();
            for (int i = 1; i <= days; i++) {
                if (year == curr.getYear() && curr.getMonth().equals(month) && i == curr.getDayOfMonth()) {
                    System.out.printf("%s%02d%s \t", RED_BRIGHT, i, RED_BRIGHT);
                } else {
                    System.out.printf("%s%02d%s \t", CYAN_BRIGHT, i, RESET);
                }
                if ((firstDay + i) % 7 == 0) System.out.println();
            }
        }
}
