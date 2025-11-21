package module4.lessons.imutable.version2;

public final class Address implements Cloneable {
    private  String city;
    private  String street;


    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
