package inheritance;

public class Redmi extends Phone {
    private int version;
    private String osVersion;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Redmi(String name, String model, String color, int version, String osVersion) {
        super(name, model, color);
        this.version = version;
        this.osVersion = osVersion;
    }
}
