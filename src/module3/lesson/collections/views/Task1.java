package module3.lesson.collections.views;

import java.util.ArrayList;
import java.util.List;

class Car {
    String name;
    String color;
    String model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }
}

public class Task1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Red", "Camry"));
        cars.add(new Car("Honda", "Blue", "Civic"));
        cars.add(new Car("Ford", "Green", "Mustang"));
        cars.add(new Car("Chevrolet", "Yellow", "Camaro"));
        cars.add(new Car("Dodge", "Black", "Charger"));
        cars.add(new Car("BMW", "White", "M3"));
        cars.add(new Car("Audi", "Silver", "S4"));
        cars.add(new Car("Mercedes", "Gray", "C63"));
        cars.add(new Car("Lexus", "Orange", "IS"));
        cars.add(new Car("Jaguar", "Purple", "XE"));
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
