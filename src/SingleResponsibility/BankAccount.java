package SingleResponsibility;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Balansınızda kifayət qədər pul yoxdur!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

