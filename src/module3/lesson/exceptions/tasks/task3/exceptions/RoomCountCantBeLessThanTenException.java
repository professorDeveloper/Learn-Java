package module3.lesson.exceptions.tasks.task3.exceptions;

public class RoomCountCantBeLessThanTenException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Xonalar soni 10 dan katta bo`lishi kerak !";
    }
}
