package lessons.oop_learn.inheritance;

public class Iphone extends Phone {
    private int chargingTime;
    private String version;

    public Iphone(String name, String model, String color, int chargingTime, String version) {
        super(name, model, color);
        this.chargingTime = chargingTime;
        this.version = version;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
