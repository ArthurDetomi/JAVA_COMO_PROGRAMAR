package org.chapter_8;

public class SavingAccount {
    public static int annualInterestRate;
    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "savingBalance=" + savingBalance +
                '}';
    }

    public static void modifyInterestRate(int rate) {
        annualInterestRate = rate;
    }

    public void calculateMonthlyInterest() {
        double interest = (this.savingBalance * ((annualInterestRate / 100.00) + 1.00)) / 12.0;
        this.savingBalance += interest;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

}
