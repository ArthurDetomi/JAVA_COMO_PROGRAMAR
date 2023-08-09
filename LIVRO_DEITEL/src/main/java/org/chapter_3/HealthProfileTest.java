package org.chapter_3;

import java.util.Scanner;

public class HealthProfileTest {
    // Exercise 3.17
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
        input.nextLine();

        System.out.println("Digite sua altura:");
        double height = Double.parseDouble(input.nextLine());

        System.out.println("Digite seu peso:");
        double weight = Double.parseDouble(input.nextLine());

        Date dateOfBirth = new Date(day, month, year);
        HealthProfile healthProfile = new HealthProfile(
                name, lastname, dateOfBirth, height, weight
        );

        healthProfile.generateTableIMC();
        System.out.println(healthProfile);
        input.close();
    }

}
