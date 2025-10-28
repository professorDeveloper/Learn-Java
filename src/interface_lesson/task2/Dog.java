package interface_lesson.task2;

public class Dog implements Animal, Pet {
    @Override
    public void live() {
        System.out.println("Dog live");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void voice() {
        System.out.println("Dog voice");
    }
}
