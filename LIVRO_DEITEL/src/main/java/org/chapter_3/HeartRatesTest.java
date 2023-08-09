package org.chapter_3;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = input.nextLine();
        System.out.println("Digite seu sobrenome:");
        String lastname = input.nextLine();
        System.out.println("Digite sua data de aniversário separado por espaço:");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();



        HeartRates people1 = new HeartRates(name, lastname,
                new Date(day, month, year));
        System.out.println(people1.calculateAge());
        System.out.println(people1);

        input.close();
    }

}
