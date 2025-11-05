package oop_learn.inheritance_3;

public class Teacher extends Person {
    private final Subject subject;
    private int salary;

    public Teacher(String name, String password, String phone, Subject subject, int salary) {
        super(name, password, phone);
        this.subject = subject;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getSalary() {
        return salary;
    }
}
