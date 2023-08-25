package org.chapter_8;

public class SavingAccountTest {
    // Exercise 8.6
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(3000d);
        SavingAccount saver2 = new SavingAccount(2000d);
        SavingAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("4%");
        System.out.println(saver1);
        System.out.println(saver2);

        SavingAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();


        System.out.println("5%");
        System.out.println(saver1);
        System.out.println(saver2);
    }

}
