package lessons.oop_learn.interface_lesson.task2;

public class Bird implements Animal{
    @Override
    public void live() {
        System.out.println("Bird live");
    }

    @Override
    public void eat() {
        System.out.println("Bird eating");
    }
}
