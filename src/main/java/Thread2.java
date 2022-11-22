public class Thread2 implements Runnable {
    private final Bank bank;

    public Thread2(Bank b) {
        this.bank = b;
    }

    @Override
    public void run() {
        synchronized (bank) {
            while (bank.getAccount() > 1){
                bank.setAccount(bank.getAccount() - 1);
                System.out.println("Dec: " + bank.getAccount());
            }
        }
        //System.out.println("Dec: " + bank.getAccount());
    }
}