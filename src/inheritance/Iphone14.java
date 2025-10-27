package inheritance;

public class Iphone14 extends Iphone {
    private int ram;
    private int storage;

    public Iphone14(String name, String model, String color, int chargingTime, String version, int ram, int storage) {
        super(name, model, color, chargingTime, version);
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
