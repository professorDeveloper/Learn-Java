package module4.threads.daemonthread;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + "::" + e.getMessage());
    }
}
