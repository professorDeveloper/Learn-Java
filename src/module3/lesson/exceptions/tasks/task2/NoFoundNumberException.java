package module3.lesson.exceptions.tasks.task2;

public class NoFoundNumberException extends ArrayIndexOutOfBoundsException {
    @Override
    public String getMessage() {
        return "Siz mavjud bo`lmagan raqamdan foydalandingiz, raqam 0 va 10 orasida bo`lishi kerak.";
    }
}
