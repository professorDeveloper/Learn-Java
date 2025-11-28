package module3.lesson.exceptions.tasks.task3.exceptions;

public class RangCantBeBlankException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Rangi bo`sh yokida null bo`lishi mumkin emas !";
    }
}
