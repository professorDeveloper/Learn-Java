package module3.lesson.solid.dependency_inversion;

public class Test {
    public static void main(String[] args) {
        SimpleKeyboard keyboard = new SimpleKeyboard();
        Computer computer = new Computer("i9", "ASUS", keyboard);
        computer.setKeyboard(new RGBKeyboard());
        System.out.println(computer.getKeyboard());
    }
}
