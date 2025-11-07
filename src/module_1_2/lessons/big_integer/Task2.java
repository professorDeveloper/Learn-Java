package module_1_2.lessons.big_integer;

import java.math.BigDecimal;

/*
BigDecimal classidan foydalanib kichkin pullarni valyuta boyicha almashtiradigan dastur yarating .
Qiymatlarni esa String wrapper classiga berib qiymatni uzunligi bilan ekranga chiqaring
*/

public class Task2 {
    public static void main(String[] args) {
        BigDecimal oneUsdInUzs = new BigDecimal("12065.92");
        BigDecimal usd = new BigDecimal("5000");
        BigDecimal uzs = oneUsdInUzs.multiply(usd);
        System.out.println("5000 USD = " + uzs + " UZS");
    }


}
