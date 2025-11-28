package module3.lesson.exceptions.tasks.task3.exceptions;

public class QavatCantBeLessThanZeroException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Qavat soni 0 dan katta bo`lishi kerak";
    }
}
