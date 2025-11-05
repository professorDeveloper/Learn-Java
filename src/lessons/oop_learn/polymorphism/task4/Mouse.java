package lessons.oop_learn.polymorphism.task4;

public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void live() {
        System.out.println("Mouse live");
    }
}
