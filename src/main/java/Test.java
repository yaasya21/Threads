public class Test {
    public static void main(String[] args) {
        final Bank bank = new Bank();

        Runnable run1 = new Thread1(bank);
        Thread thr1 = new Thread(run1);

        Runnable run2 = new Thread2(bank);
        Thread thr2 = new Thread(run2);

        thr1.start();
        thr2.start();
    }
}
