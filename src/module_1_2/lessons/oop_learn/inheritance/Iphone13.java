package module_1_2.lessons.oop_learn.inheritance;

public class Iphone13 extends Iphone {
    private int ram;
    private int storage;

    public Iphone13(String name, String model, String color, int chargingTime, String version, int ram, int storage) {
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

    @Override
    public String toString() {
        return "Iphone13{" +
                "ram=" + ram +
                ", storage=" + storage +
                ", version='" + super.getVersion() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", chargingTime=" + super.getChargingTime() +
                '}';
    }
}
