package module4.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    private String fullName;
    private transient int age;
    private transient String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee() {
    }

    public Employee(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName='" + fullName + '\'' + ", age=" + age + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.fullName.substring(0, 5));
        out.writeObject(this.phoneNumber.substring(5));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.fullName = (String) in.readObject();
        this.phoneNumber = (String) in.readObject();
    }
}
