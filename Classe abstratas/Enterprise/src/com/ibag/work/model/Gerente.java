package com.ibag.work.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularAumentoSalario() {
        return super.getSalario() * 1.20;
    }
}