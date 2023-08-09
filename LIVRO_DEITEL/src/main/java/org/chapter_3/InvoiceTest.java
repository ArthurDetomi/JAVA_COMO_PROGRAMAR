package org.chapter_3;

public class InvoiceTest {
    // Exercise 3.13
    public static void main(String[] args) {
        Invoice invoice = new Invoice(
                "21356",
                "compra de livro",
                123,
                99.87
        );
        System.out.println(invoice);
    }

}
