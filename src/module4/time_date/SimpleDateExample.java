package module4.time_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateExample {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'helloo' HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println( format);
    }
}
