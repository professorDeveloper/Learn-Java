package module3.lesson.collections.generics.task2;

public class Main {
    public static void main(String[] args) {
        AnimalHouse<Cat> catHouse = new AnimalHouse<>(new Cat("Kisa", "Black"));
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>(new Dog("Buldok", "White"));
        AnimalHouse<Sheep> sheepHouse = new AnimalHouse<>(new Sheep("Sheep", "White"));
        AnimalHouse<Horse> horseHouse = new AnimalHouse<>(new Horse("Horse", "Black"));
        System.out.println(catHouse.getAnimal());
        System.out.println(dogHouse.getAnimal());
        System.out.println(sheepHouse.getAnimal());
        System.out.println(horseHouse.getAnimal());
    }
}
