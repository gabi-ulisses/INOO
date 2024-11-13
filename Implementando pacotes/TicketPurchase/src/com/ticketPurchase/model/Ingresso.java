package com.ticketPurchase.model;

public class Ingresso {
    private String nomeShow;
    private String data;
    private String local;
    private double preco;
    private boolean disponivel;

    public Ingresso(String nomeShow, String data, String local, double preco) {
        this.nomeShow = nomeShow;
        this.data = data;
        this.local = local;
        this.preco = preco;
        this.disponivel = true; // Ingresso disponível por padrão
    }

    public String getNomeShow() {
        return nomeShow;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
