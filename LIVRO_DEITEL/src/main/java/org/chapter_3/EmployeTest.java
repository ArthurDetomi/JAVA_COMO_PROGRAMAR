package org.chapter_3;

public class EmployeTest {
    // Exercise 3.14
    public static void main(String[] args) {
        Employe employe1 = new Employe(
                "Arthur",
                "Detomi",
                980.00
        );

        Employe employe2 = new Employe(
                "Joao",
                "Augusto",
                2000.00
        );

        employe1.setSalary(employe1.getSalary() * 1.10);
        employe2.setSalary(employe1.getSalary() * 1.10);

        System.out.println(employe1.getSalary());
        System.out.println(employe2.getSalary());
    }

}
