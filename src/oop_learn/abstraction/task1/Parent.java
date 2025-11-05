package oop_learn.abstraction.task1;

public class Parent extends Person {

    public Parent(String name, String phone) {
        super(name, phone);
    }

    @Override
    void speak() {
        System.out.println("Parent is speaking");
    }

    @Override
    void walk() {
        System.out.println("Parent is walking");
    }
}
