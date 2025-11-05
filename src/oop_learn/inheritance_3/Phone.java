package oop_learn.inheritance_3;

import java.util.Objects;

public class Phone {
    private String name;
    private String color;
    private String storage;

    public Phone(String name, String color, String storage) {
        this.name = name;
        this.color = color;
        this.storage = storage;
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

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(name, phone.name) && Objects.equals(color, phone.color) && Objects.equals(storage, phone.storage);
    }


}
