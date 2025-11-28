package module3.lesson.exceptions.tasks.task3.exceptions;

public class PersonNameCantBeBlankException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Foydalanuvchi ismi bo`sh yokida null bo`lishi mumkin emas !";
    }
}
