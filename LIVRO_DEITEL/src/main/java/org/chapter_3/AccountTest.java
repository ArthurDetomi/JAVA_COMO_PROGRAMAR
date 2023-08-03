package org.chapter_3;

public class AccountTest {
    // Exercise 3.12
    public static void main(String[] args) {
        Account pessoa1 = new Account(1000.00);
        Account pessoa2 = new Account(90.00);

        pessoa2.credit(2000.00);

        pessoa1.debit(1001.00);

        System.out.println(pessoa1.getBalance());
        System.out.println(pessoa2.getBalance());
    }

}
