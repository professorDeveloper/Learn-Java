package module1.tasks.task_two;

class MainUser {
    public static void main(String[] args) {
        User user = new User("gg", "ggg", 19, "+gg", false);

        String name = user.getIsm();
        String familya = user.getFamilya();
        int age = user.getAge();
        String phoneNumber = user.getPhoneNumber();
        boolean isMale = user.isMale();

        System.out.println("Ismi: " + name + " Familya: " + familya + " yoshi: " + age + " telefoni raqami: " + phoneNumber + " Jinsi: " + isMale);
    }
}
