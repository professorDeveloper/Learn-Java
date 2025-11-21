package module4.lessons.imutable.task;

import java.util.concurrent.TimeUnit;

public class ImmutableTask {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnbale1 = () -> {
            User user1 = new User("Eshmat", 25, new Job("Software Engineer", 5000));
            User user2 = new User("Toshmat", 30, new Job("Doctor", 7000));
            System.out.println(user1.getName() + " " + user1.getJob().getName());
            System.out.println(user2.getName() + " " + user2.getJob().getName());
        };
        Thread thread1 = new Thread(runnbale1);
        thread1.start();
        TimeUnit.MILLISECONDS.sleep(100);
        Runnable runnable2 = () -> {
            User user3 = new User("Azamov", 35, new Job("Builder", 8000));
            User user4 = new User("Komil", 40, new Job("Engineer", 9000));
            System.out.println(user3.getName() + " " + user3.getJob().getName());
            System.out.println(user4.getName() + " " + user4.getJob().getName());
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

}


final class User {
    private final String name;
    private final int age;
    private final Job job;

    public User(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

final class Job {
    private final String name;
    private final int salary;

    public Job(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}


