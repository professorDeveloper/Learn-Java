package module3.lesson.queue.task;

import org.jetbrains.annotations.NotNull;

public class User  {
    private String name;
    private String phone;
    private int age;

    public User(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
