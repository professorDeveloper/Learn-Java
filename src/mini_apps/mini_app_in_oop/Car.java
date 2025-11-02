package mini_apps.mini_app_in_oop;

public class Car {
    private String registeredNumber;
    private String type;

    public Car() {
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String registeredNumber, String type) {
        this.registeredNumber = registeredNumber;
        this.type = type;
    }
}
