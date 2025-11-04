package lesson_enum.task2;

public class Phone {
    String name;
    Model model;
    String color;

    public Phone(String name, Model model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Model: " + model + ", Storage: " + model.getStorage() + "GB");
    }

}

