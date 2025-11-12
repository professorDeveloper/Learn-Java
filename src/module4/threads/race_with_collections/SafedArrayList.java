package module4.threads.race_with_collections;
/*
ArrayList thread-safe qilib ushbu collectionni ustida CRUD operastsiyalarni bajaradi dastur yozing.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class SafedArrayList {

    private List<User> users = new ArrayList<>();

    public SafedArrayList(ArrayList<User> users) {
        this.users = Collections.synchronizedList(users);
    }

    public void create(User user) {
        synchronized (this) {
            users.add(user);
            System.out.println(Thread.currentThread().getName() + " created: " + user.name);
        }
    }

    public void delete(User user) {
        synchronized (this) {
            boolean remove = users.remove(user);
            if (remove) {
                System.out.println(Thread.currentThread().getName() + " deleted: " + user.name);
            } else {
                System.out.println(Thread.currentThread().getName() + " not deleted: " + user.name);
            }
        }
    }

    public void update(User user) {
        synchronized (this) {
            int index = users.indexOf(user);
            boolean remove = users.remove(user);
            if (remove) {
                users.add(index, user);
                System.out.println(Thread.currentThread().getName() + " updated: " + user.name);
            } else {
                System.out.println(Thread.currentThread().getName() + " not updated: " + user.name);
            }
        }
    }

    public void read() {
        synchronized (this) {
            for (User user : users) {
                System.out.println(Thread.currentThread().getName() + " read: " + user.name);
            }
        }
    }
}


class SafeTest {
    public static void main(String[] args) throws InterruptedException {
        var users = new ArrayList<User>();
        SafedArrayList arrayList = new SafedArrayList(users);
        Runnable r1 = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arrayList.create(new User("John", 20));

        };
        Runnable r2 = () -> {
            arrayList.create(new User("Bob", 30));
            arrayList.read();
        };
        Runnable r3 = () -> {
            arrayList.delete(new User("John", 20));
            arrayList.read();
            try {
                arrayList.delete(new User("John", 20));
                arrayList.read();
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r2, "Thread 2");
        Thread t3 = new Thread(r3, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
        TimeUnit.SECONDS.sleep(1);
    }
}


class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
