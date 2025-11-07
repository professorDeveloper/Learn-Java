package module_1_2.lessons.memory_managment;

public class App {
    public static void main(String[] args) {
        Integer i = 10;
        App app = new App();
        // with integer
        app.m1(i);
        System.out.println(i);
        Counter ct = new Counter();
        // Counter data  first changed
        ct.counter = 252;
        System.out.println(ct.counter);
        //Counter data  changed with Passing value
        app.m2(ct);
        System.out.println(ct.counter);
    }
    public void m1(Integer i){
        i =25;
    }

    public void m2(Counter c){
        c.counter =25;
    }
}
