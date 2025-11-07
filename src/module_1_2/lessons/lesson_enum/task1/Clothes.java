package module_1_2.lessons.lesson_enum.task1;

public class Clothes {
    private final Size size;

    private final Gender gender;
    private final String color;

    public Clothes(Size size, Gender gender, String color) {
        this.size = size;
        this.gender = gender;
        this.color = color;
    }

    public Gender getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}
