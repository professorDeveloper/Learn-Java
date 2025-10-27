package inheritance_3;


public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ali", "parol", "+998990001451", "231", 21, new Phone("Redmi", "yellow", "512GB")),
                new Student("Anvar", "2451", "+998990101010", "331", 21, new Phone("Teslaphone", "red", "1TB")),
                new Student("Muxtor", "2121", "+998910303030", "303", 21, new Phone("Xiami", "gray", "256GB")),
        };
        Student student = new Student("Anvar", "2451", "+998990101010", "331", 21, new Phone("Iphone", "red", "0GB"));
        Student studentOrg = new Student("Anvar", "2451", "+998990101010", "331", 21, new Phone("Teslaphone", "red", "1TB"));
        updatePassword(students,student,"2451","654321");
        System.out.print("part2--> "); updatePassword(students,studentOrg,"2451","654321");

    }


    public static void updatePassword(Student[] students, Student newStudent, String oldPassword, String newPassword) {
        for (Student student : students) {
            if (student.getPhone().equals(newStudent.getPhone())) {
                if (student.password.equals(oldPassword)) {
                    student.changePasscode(oldPassword, newPassword);
                } else {
                    System.out.println("Eski parol talaba uchun mos kelmaydi: " + student.name);
                }
                return;
            }
        }
        System.out.println("Massivda mos keladigan talaba topilmadi.");
    }
}
