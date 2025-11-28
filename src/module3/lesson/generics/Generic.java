package module3.lesson.generics;

import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Generic<E> { // type parameter
    private Object[] elementData;

    public Generic(int capacity) {
        this.elementData = new Object[capacity];
    }

    public Generic() {
        this.elementData = new Object[3];
    }

    public boolean set(int index, E element) {
        elementData[index] = element;
        return true;
    }

    public E get(int index) {
        Objects.checkIndex(index, elementData.length);
        return (E) elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}

class GenericTest {
    public static void main(String[] args) {
        Generic<String> languages = new Generic<>(); // type argument
        languages.set(0, "Java");
        languages.set(1, "Kotlin");
        languages.set(2, "Dart");
        System.out.println(languages.get(1));
        System.out.println(languages);
        Generic<Student> students = new Generic<>(10);
        students.set(0, new Student(UUID.randomUUID().variant(), "Azamov"));
        System.out.println(students);

    }
}

class Student {
    private final int studentID;
    private final String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
