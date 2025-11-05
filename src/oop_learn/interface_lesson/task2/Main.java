package oop_learn.interface_lesson.task2;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.live();
        lion.eat();
        lion.run();

        Dog dog = new Dog();
        dog.live();
        dog.eat();
        dog.voice();
    }
}
