package mini_app_in_oop;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Parking parking = new Parking();
        int rowCount = 5;
        int cellCount = 6;
        parking.buildPark(rowCount,cellCount);
        System.out.println(Arrays.toString(parking.getRows()));
    }
}
