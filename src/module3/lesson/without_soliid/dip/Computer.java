package module3.lesson.without_soliid.dip;

public class Computer {
    String cpu;
    String maker;
    SimpleKeyboard keyboard;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public SimpleKeyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(SimpleKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(String cpu, String maker, SimpleKeyboard keyboard) {
        this.cpu = cpu;
        this.maker = maker;
        this.keyboard = keyboard;
    }
}
