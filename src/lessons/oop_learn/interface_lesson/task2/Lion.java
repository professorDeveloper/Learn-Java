package lessons.oop_learn.interface_lesson.task2;

public class Lion implements Animal,Wild{

    @Override
    public void live() {
        System.out.println("Lion live");
    }

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }

    @Override
    public void run() {
        System.out.println("Lion run");
    }
}
