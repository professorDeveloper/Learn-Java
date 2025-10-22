package oop_learn.tasks;


class CalMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.first = 10;
        calculator.second = 5;
        calculator.sign = '+';
        calculator.calculate();
        calculator.printResult();
    }
}

/**
 * Kalkulator classi yaratilsin
 * 2ta sonni saqlovchi first va second , belgi saqlovchi sign va natijani saqlochi result fieldi bo'lsin
 * calculate methodi bo'lsin . First va second methodi sign orqali qiymatlarni hisoblasin.
 * Masalan: signni qiymati ( + ) bo'ladigan bo'lsa first va secondni yi'gindisini resultga o'zlashtirsin;
 * Print methodi ham bo'lsin. Malumotlarni "first sign second = result" ko'rinishida chop etsin
 **/
public class Calculator {
    public int first, second, result;
    public char sign;

    public void calculate() {
        switch (sign) {
            case '+' -> {
                result = first + second;
            }
            case '-' -> {
                result = first - second;
            }
            case '*' -> {
                result = first * second;
            }
            case '/' -> {
                result = first / second;
            }
        }
    }

    public void printResult() {
        System.out.printf("%d %c %d = %d", first, sign, second, result);
    }
}
