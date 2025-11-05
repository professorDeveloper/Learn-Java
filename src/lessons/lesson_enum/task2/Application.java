package lessons.lesson_enum.task2;

public class Application {
    /*Asosit logikalar yozish uchun Application classini yarating.
            run() methodida hamma logikalar joylashtirilsin.
    Bu classni ishlatish uchun Singleton design patternidan foydalaning
    Buning uchun class ichida instance yaratuvchi va qaytaruvchi method yarating.
    Phone classini yarating name,model enum classi va storage fieldlarini salvochi
            Model enumida PHONE,SAMSUNG,REDMI qiymatlari bo'lsin
    instance orqali run methodini ishga tushuring
*/
    private static Application instance;

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    public void run() {
        System.out.println("Application started...");
        Phone samsung = new Phone("Samsung 24 ultra", Model.SAMSUNG, "Black");
        Phone redmi = new Phone("Redmi note 13 ", Model.REDMI, "Gray");
        Phone iphone = new Phone("Iphone 17 pro", Model.IPHONE, "Orange");
        samsung.displayInfo();
        redmi.displayInfo();
        iphone.displayInfo();
    }

    private Application() {
    }
}
