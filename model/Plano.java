package model;

public class Plano {
    private String tipo;
    private double preco;

    public Plano(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }
}
