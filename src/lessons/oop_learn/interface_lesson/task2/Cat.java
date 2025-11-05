package lessons.oop_learn.interface_lesson.task2;

public class Cat implements Animal,Pet {
    @Override
    public void live() {
        System.out.println("Cat live");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void voice() {
        System.out.println("Cat voice");
    }
}
