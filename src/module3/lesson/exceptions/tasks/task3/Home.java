package module3.lesson.exceptions.tasks.task3;

import module3.lesson.exceptions.tasks.task3.exceptions.PersonNameCantBeBlankException;
import module3.lesson.exceptions.tasks.task3.exceptions.QavatCantBeLessThanZeroException;
import module3.lesson.exceptions.tasks.task3.exceptions.RangCantBeBlankException;
import module3.lesson.exceptions.tasks.task3.exceptions.RoomCountCantBeLessThanTenException;

public class Home {
    String color;
    int column;
    int roomCount;
    String personName;

    public Home(String color, int column, int roomCount, String personName) {
        if (color == null || color.isEmpty()) {
            throw new RangCantBeBlankException();
        }
        if (column <= 0) {
            throw new QavatCantBeLessThanZeroException();
        }
        if (roomCount < 10) {
            throw new RoomCountCantBeLessThanTenException();
        }
        if (personName == null || personName.isEmpty()) {
            throw new PersonNameCantBeBlankException();
        }
        this.color = color;
        this.column = column;
        this.roomCount = roomCount;
        this.personName = personName;
    }
}
