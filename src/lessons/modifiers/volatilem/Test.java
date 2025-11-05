package lessons.modifiers.volatilem;

public class Test {
    private volatile String a;
    // Videotable kalit so'zi har doim yangilanishiga ishonch hosil qilish uchun ishlatiladi
    // field is thread safe
    private transient String b; // agar fieldlar transient  bilan elon qilinsa
}
