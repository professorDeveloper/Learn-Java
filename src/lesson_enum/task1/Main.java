package lesson_enum.task1;

/*O'lchamlarni saqlovchi Size nomli Enum classi yarating unda S,M,X,XL qiymatlari bo'lsin.
Jinslarni saqlash uchun Gender Enumini yarating unda MALE,FEMALE qiymatlari bo'lsin
Clothes nomli class yarating unda rangi va Size enumini ham saqlang
        Class yaratyapganda asosiy qoidalariga etibor bering
        Bir nechta Clothes classidan object yaratib ularni hammasini var keywordli o'zgaruvchilarga saqlang
Hammasini ekranga chop eting*/
public class Main {
    public static void main(String[] args) {
        var clothes1 = new Clothes(Size.S, Gender.MALE, "Red");
        var clothes2 = new Clothes(Size.XL, Gender.FEMALE, "Black");
        var clothes3 = new Clothes(Size.M, Gender.MALE, "White");

        System.out.println(clothes1);
        System.out.println(clothes2);
        System.out.println(clothes3);
    }
}
