package oop_learn.abstraction.task1;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("John", "1234567890");
        parent.speak();
        parent.walk();

        Student student = new Student("John", "1234567890");
        student.speak();
        student.walk();
    }
}
