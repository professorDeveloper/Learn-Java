package module3.lesson.without_soliid.dip;

public class Test {
    public static void main(String[] args) {
        SimpleKeyboard keyboard = new SimpleKeyboard();
        Computer computer = new Computer("i9", "ASUS", keyboard);
//        computer.setKeyboard(new RGBKeyboard());
    }
}
