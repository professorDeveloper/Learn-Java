package polymorphism.task4;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.live();
        cat.eat();

        Dog dog = new Dog();
        dog.live();
        dog.eat();
    }
}
