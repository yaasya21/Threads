public class Thread1 implements Runnable {
    private final Bank bank;

    public Thread1(Bank b) {
        this.bank = b;
    }

    @Override
    public void run() {
        synchronized (bank) {
            while (bank.getAccount() < 20000){
                bank.setAccount(bank.getAccount() + 2);
                System.out.println("Inc: " + bank.getAccount());
            }
        }
        //System.out.println("Inc: " + bank.getAccount());
    }
}
