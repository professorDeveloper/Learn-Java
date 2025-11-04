package module1.lesson_one;


/*
Width, height va result fieldlari bo'lgan Rectangle classini encapsulation prinsipi asosida yarating
result ga to'rtburchakning yuzi hisoblanib o'zlashtiradigan calculate methodi bo'lsin
        "width * height = reult" ko'rinishida consolega chop etilsin.
*/

public class Rectangle {
    private int width;
    private int height;
    private int result;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calculate() {
        result = width * height;
    }

    public void printResult() {
        System.out.printf("%d * %d = %d", width, height, result);
    }
}
