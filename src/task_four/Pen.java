package task_four;
/*
miqdor,clicked va oneLetter fieldlari bo'lgan Pen Classi encapsulation prinsplariga asoslangan holda yaratilsin.
Miqdor -> ruchkani siyohi qanchaligi
Clicked -> ruchka bosilganmi yoki yo'q
OneLetter -> bitta harf uchun qancha siyoh ketishi
write methodi orqali ruchka yoshishni boshlasin. Katta harf yozilganda kichkina harfga qaraganda 2 barobar siyoh sarflasin, agarda bo'sh joy keladigan bo'lsa siyoh sarflanmasin. Agar siyoh tugasa ruchka yozishdan to'xtasin va yozilgan text consolega chiqarilsin.
*/

public class Pen {
    int miqdor;
    boolean clicked;
    int oneLetter;

    public Pen(int miqdor, int oneLetter) {
        this.miqdor = miqdor;
        this.oneLetter = oneLetter;
        this.clicked = false;
    }

    // Getter va Setterlar
    public int getMiqdor() {
        return miqdor;
    }

    public void setMiqdor(int miqdor) {
        if (miqdor >= 0) {
            this.miqdor = miqdor;
        }
    }

    public boolean isClicked() {
        return clicked;
    }

    public void click() {
        this.clicked = !this.clicked; // bosilsa yoqiladi / o‘chadi
    }

    public double getOneLetter() {
        return oneLetter;
    }

    public void setOneLetter(int oneLetter) {
        if (oneLetter > 0) {
            this.oneLetter = oneLetter;
        }
    }

    public void write(String text) {
        if (!clicked) {
            System.out.println("Ruchka bosilmagan! Avval click() metodini chaqiring.");
            return;
        }

        StringBuilder written = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (miqdor <= 0) {
                System.out.println("Siyoh tugadi! Yozish to‘xtatildi.");
                break;
            }

            if (ch == ' ') {
                written.append(ch);
                continue;
            }
            int siyohSum;
            if (ch >= 'A' && ch <= 'Z') {
                siyohSum = oneLetter * 2;
            } else {
                siyohSum = oneLetter;
            }

            if (miqdor - siyohSum >= 0) {
                written.append(ch);
                miqdor -= siyohSum;
            } else {
                System.out.println("Siyoh yetmadi.");
                break;
            }
        }

        System.out.println("Yozilgan matn: " + written.toString());
        System.out.println("Qolgan siyoh: " + miqdor);
    }

}
