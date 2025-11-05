package oop_learn.abstraction.task1;

public class Student extends Person {
    public Student(String name, String phone) {
        super(name, phone);
    }

    @Override
    void speak() {
        System.out.println(this.getName() + "is speaking");
    }

    @Override
    void walk() {
        System.out.println(this.getName() + " is walking");
    }
}
