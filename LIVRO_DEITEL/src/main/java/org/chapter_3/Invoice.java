package org.chapter_3;

public class Invoice {

    private String numero;
    private String descricao;
    private int quantidade;
    private double price;

    @Override
    public String toString() {
        return "Invoice{" +
                "numero='" + numero + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", price=" + price +
                ", amount=" + getInvoiceAmount() +
                '}';
    }

    public Invoice(String numero, String descricao, int quantidade, double price) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = Math.max(quantidade, 0);
        this.price = Math.max(price, 0.0d);
    }

    public double getInvoiceAmount() {
        return this.price * this.quantidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(quantidade, 0);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0.0d);
    }
}
