public class Bank {
    private int account = 2;

    public void setAccount(int account) {
        if (account < 0) {
            throw new IllegalArgumentException("The money on account must be >=0");
        }
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public synchronized void inc() {
        for(; account <= 20000; account += 2) {
            System.out.println("Inc = " + account);
        }
    }

    public synchronized void dec() {
        for(; account >= 1; account--) {
            System.out.println("Dec = " + account);
        }
    }
}
