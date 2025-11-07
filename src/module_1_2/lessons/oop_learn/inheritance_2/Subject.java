package module_1_2.lessons.oop_learn.inheritance_2;

public class Subject {
    private String name;
    private int classNumber;

    public Subject(String name, int classNumber) {
        this.name = name;
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return name + " #" + classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
