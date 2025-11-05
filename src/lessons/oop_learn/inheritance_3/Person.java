package lessons.oop_learn.inheritance_3;

public class Person {
    protected String name;
    protected String password;
    protected String phone;

    public Person(String name, String password, String phone) {
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public void changePasscode(String oldPasscode, String newPasscode) {
        if (password.equals(oldPasscode)) {
            password = newPasscode;
            System.out.println("Password has been changed.");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}
