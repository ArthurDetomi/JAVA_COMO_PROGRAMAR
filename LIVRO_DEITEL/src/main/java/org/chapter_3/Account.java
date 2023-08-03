package org.chapter_3;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        double posDebit = this.balance - amount;
        if (posDebit >= 0.0) {
            this.balance = posDebit;
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
