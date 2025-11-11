package module4.threads.deadlock;

public class RaceConditionProblemSolved {
    public static final int N_ACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double AMOUNT = 100;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        var bank = new Bank(N_ACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < N_ACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        int amount = (int) (AMOUNT * AMOUNT);
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((long) (DELAY * Math.random()));
                    }
                } catch (Exception ignored) {

                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}

