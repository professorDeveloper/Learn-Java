package projects.mini_app_in_oop;

import java.util.Locale;

public class CarType {
    public static String EMPTY_SIGN = "✅";
    public static String POLICE = "🚓";
    public static String FIRE = "🚒";
    public static String AMBULANCE = "🚑";
    public static String TAXI = "🚕";
    public static String BUS = "🚌";
    public static String DEFAULT = "🚗";

    public static String findCarTypeByCarTypeName(String type) {
        switch (type.toUpperCase(Locale.ROOT)) {
            case "POLICE":
                return POLICE;
            case "FIRE":
                return FIRE;
            case "AMBULANCE":
                return AMBULANCE;
            case "TAXI":
                return TAXI;
            case "BUS":
                return BUS;
            default:
                return DEFAULT;
        }
    }
}
