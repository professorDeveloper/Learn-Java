package module3.lesson.solid.dependency_inversion;

public class Computer {
    String cpu;
    String maker;
    Keyboard keyboard;

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

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer(String cpu, String maker, Keyboard keyboard) {
        this.cpu = cpu;
        this.maker = maker;
        this.keyboard = keyboard;
    }
}
