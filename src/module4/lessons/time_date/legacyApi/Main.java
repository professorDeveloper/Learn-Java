package module4.lessons.time_date.legacyApi;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
//        System.out.println(date.before(new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24)));
        
    }
}

