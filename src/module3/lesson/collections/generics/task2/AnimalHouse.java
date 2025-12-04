package module3.lesson.collections.generics.task2;

public class AnimalHouse<E extends Animal> {
    private E animal;

    public AnimalHouse(E animal) {
        this.animal = animal;
    }

    public E getAnimal() {
        return animal;
    }

    public void setAnimal(E animal) {
        this.animal = animal;
    }
}
