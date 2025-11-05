package lessons.oop_learn.inheritance;

public class Samsung extends Phone {
    private int version;


    public Samsung(String name, String model, String color, int version) {
        super(name, model, color);
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "version=" + version +
                ", name='" + super.getName() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
