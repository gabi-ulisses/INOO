package com.ibag.work.model;

public class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularAumentoSalario() {
        return super.getSalario() * 1.10;
    }
}