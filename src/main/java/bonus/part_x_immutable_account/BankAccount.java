package bonus.part_x_immutable_account;

class BankAccount {
    private String holder;

    private double balance;

    public BankAccount(String holder) {
        this.holder = holder;
        this.balance = 0;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}