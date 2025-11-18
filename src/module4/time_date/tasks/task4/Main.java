package module4.time_date.tasks.task4;

public class Main {
    public static void main(String[] args) {
        StringToDate stringToDate = new StringToDate("yyyy/MM/dd");
        System.out.println(stringToDate.getDate("2025/02/11"));
    }
}
