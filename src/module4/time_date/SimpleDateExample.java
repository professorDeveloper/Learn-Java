package module4.time_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateExample {
    public static void main(String[] args) throws ParseException {
        format();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate="23/03/2020";
       Date date =simpleDateFormat.parse(formatedDate);
        System.out.println(date);
    }

    private static void format() {
        Date date =new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'helloo' HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println( format);
    }
}
