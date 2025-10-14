package princples;

public class KissTest {
    public static String getDay(int number) {
        switch (number) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sundey";
            }
            default -> {
                return "Err";
            }
        }
    }

    public static String getDayWithKiss(int number) {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return day[number - 1];
    }
    public static void main(String[] args) {

    }
}
