package module_1_2.lessons.oop_learn.inheritance_2;

public class Student extends Person {
    private String parentNumber;
    private int schoolNumber;
    private Phone phone;

    public String getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(String parentNumber) {
        this.parentNumber = parentNumber;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Student(String name, String password, String phone, String parentNumber, int schoolNumber, Phone phone1) {
        super(name, password, phone);
        this.parentNumber = parentNumber;
        this.schoolNumber = schoolNumber;
        this.phone = phone1;
    }

    public void call(String number) {
        System.out.printf(this.name + " is calling " + number + "from " + this.phone + "\n");
    }



}
