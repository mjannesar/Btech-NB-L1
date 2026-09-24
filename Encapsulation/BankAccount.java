package Encapsulation;

public class BankAccount {
    private long accNumber;
    private double balance;

          BankAccount(long accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public BankAccount() {

    }

    private void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
