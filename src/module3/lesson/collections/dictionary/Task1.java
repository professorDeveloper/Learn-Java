package module3.lesson.collections.dictionary;

import java.util.HashMap;
import java.util.Map;

class Car {
    String name;
    String color;
    String model;

    public Car(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red", "Camry");
        Car car2 = new Car("Honda", "Blue", "Civic");
        Car car3 = new Car("Ford", "Green", "Mustang");
        Car car4 = new Car("Chevrolet", "Yellow", "Camaro");
        Car car5 = new Car("Dodge", "Black", "Charger");
        Car car6 = new Car("BMW", "White", "M3");
        Car car7 = new Car("Audi", "Silver", "S4");
        Car car8 = new Car("Mercedes", "Gray", "C63");
        Car car9 = new Car("Lexus", "Orange", "IS");
        Car car10 = new Car("Jaguar", "Purple", "XE");
        Map<Integer, Car> cars = new HashMap<>();
        cars.put(10000, car1);
        cars.put(20000, car2);
        cars.put(30000, car3);
        cars.put(40000, car4);
        cars.put(50000, car5);
        cars.put(60000, car6);
        cars.put(70000, car7);
        cars.put(80000, car8);
        cars.put(90000, car9);
        cars.put(100000, car10);
        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        getCarByPrice(cars, 50000);
    }

    public static void getCarByPrice(Map<Integer, Car> cars, int price) {
        System.out.println("Get cars by price");
        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            if (entry.getKey() < price) {
                System.out.println(entry.getValue());
            }
        }
    }
}
