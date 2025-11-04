package module1.tasks.task_three;

/*
roomNumber,teacherName,teacherPhoneNumber, studentName (bittadan ko'p bo'ladi) va studentCount fieldlari bo'lgan ClassRoom classini encapsulation prinsipi asosida yarating
Malumotlar console orqali kiritilsin.
roomnumber, teacherNmae va studentlarini chop eting
*/

public class ClassRoom {
    private int roomNumber;
    private String teacherName;
    private String teacherPhoneNumber;
    private String studentName;
    private int studentCount;

    public ClassRoom(int roomNumber, String teacherName, String teacherPhoneNumber, String studentName, int studentCount) {
        this.roomNumber = roomNumber;
        this.teacherName = teacherName;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.studentName = studentName;
        this.studentCount = studentCount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentCount() {
        return studentCount;
    }

}

