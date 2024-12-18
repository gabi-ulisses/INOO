package com.ibag.system.model;

public class ClienteEspecial extends Cliente {
    private double desconto; // Percentual de desconto

    public ClienteEspecial(String nome, String email, double desconto) {
        super(nome, email);
        this.desconto = desconto;
    }

    @Override
    public double getDesconto() {
        return desconto; // Retorna o desconto específico para ClienteEspecial
    }

    @Override
    public String toString() {
        return super.toString() + " (Cliente Especial)";
    }
}
