package record_learn;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        BookRecord bookRecord = new BookRecord("Robinson Crusoe", "Daniel Defoe", 500, 1000);
        System.out.println(bookRecord.json());
        BookRecord bookRecordWithError = new BookRecord("Robinson Crusoe", "Daniel Defoe", 0, 1000);
        System.out.println(bookRecordWithError.json());
    }
}
