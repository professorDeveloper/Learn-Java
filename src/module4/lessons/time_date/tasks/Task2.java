package module4.lessons.time_date.tasks;

import java.time.LocalDate;
/*
String qabul qiladigan va LocalDate parse qilib LocalDate qaytaradigan dastur yozing.
*/

public class Task2 {
    public static void main(String[] args) {
        var now = getNow();
        var date = parse("2025-02-12");
        System.out.println("Now time: " + now);
        System.out.println("Date: " + date);
    }

    private static LocalDate parse(String date) {
        return LocalDate.parse(date);
    }

    private static LocalDate getNow() {
        return LocalDate.now();
    }

}
