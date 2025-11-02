package tasks.task_two;

/*
Ism, Familya, PhoneNumber, Age va isMale fieldlari bo'lgan User classini encapsulation prinsipi asosida yarating
        "Ismi: Familya Ism, yoshi: age, telefoni raqami: phoneNumber, Jinsi: isMale" ko'rinishida consolega chop etilsin.
*/

public class User {
    private String ism;
    private String familya;
    private int age;
    private String phoneNumber;
    private boolean isMale;

    public User(String ism, String familya, int age, String phoneNumber, boolean isMale) {
        this.ism = ism;
        this.familya = familya;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.isMale = isMale;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}


