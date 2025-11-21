package module4.lessons.time_date.legacyApi;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.DATE, 5);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DATE, 133);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.DATE, 32);
        System.out.println(calendar.getTime());
    }
}
