package module4.imutable;

public final class Employee {
    private final String fullName;
    private final int age;
    private final Address address;

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public Employee(String fullName, int age, Address address) throws CloneNotSupportedException {
        this.fullName = fullName;
        this.age = age;
        this.address = (Address) address.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
