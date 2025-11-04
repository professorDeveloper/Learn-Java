package module1.tasks.task_three;

public class MainClassRoom {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(1, "Sherzod", "123456", "Azam", 1);

        System.out.println("Room number: " + classRoom.getRoomNumber());
        System.out.println("Teacher name: " + classRoom.getTeacherName());
        System.out.println("Teacher phone number: " + classRoom.getTeacherPhoneNumber());
        System.out.println("Student name: " + classRoom.getStudentName());
        System.out.println("Student count: " + classRoom.getStudentCount());
    }
}
