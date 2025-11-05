package lessons.memory_managment.garbage_collection;

public class GCDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            // Har safar yangi obyekt yaratiladi
            String data = new String("Object " + i);
        }
        System.gc(); // Qo‘lda GC chaqirish (faqat signal, majburiy emas)
        System.out.println("Garbage Collection chaqirildi!");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obyekt yo‘q qilindi!");
    }
}
