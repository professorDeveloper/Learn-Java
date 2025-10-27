package inheritance_2;

public class Main {
       public static void main(String[] args) {
        Student[] students = {
                new Student("Sherzod", "123456", "998998998", "998998998", 1, new Phone("Iphone", "Black", "120GB")),
                new Student("Azam", "123456", "998998998", "998998998", 1, new Phone("Samsung", "Black", "256")),
                new Student("Aziz", "123456", "998998998", "998998998", 1, new Phone("redmi", "Black", "65")),
        };
        resetPassword(students, new Phone("Iphone", "Black", "120GB"), "123456", "654321");
        resetPassword(students, new Phone("Iphone", "Black", "120GB"), "123456", "654321");
    }

    public static void resetPassword(Student[] students, Phone phone, String oldPassword, String newPassword) {
        for (Student student : students) {
            if (student.getPhone().equals(phone) && student.password.equals(oldPassword)) {
                student.changePasscode(oldPassword, newPassword);
                return;
            }
        }
        System.out.println("Ushbu telefon va parol bilan talaba topilmadi.");
    }
}
