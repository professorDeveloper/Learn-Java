package module4.time_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateExample {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = "23/03/2020";
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            service.execute(() -> {
                try {
                    System.out.println(simpleDateFormat.parse(formatedDate));
                } catch (Exception ignored) {
                }
            });
        }
        service.shutdown();

//        format();

    }

    private static void format() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'helloo' HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
