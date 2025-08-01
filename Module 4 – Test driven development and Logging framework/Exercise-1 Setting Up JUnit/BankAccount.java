public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
