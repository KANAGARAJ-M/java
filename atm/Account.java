import java.util.*;

class Account {
    private String accountNumber;
    private double balance;
    private User user;

    public Account(String accountNumber, double initialBalance, User user) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.user = user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account toAccount, double amount) {
        if (withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }

    public User getUser() {
        return user;
    }
}