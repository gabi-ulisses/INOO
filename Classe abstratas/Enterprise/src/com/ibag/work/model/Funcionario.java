package com.ibag.work.model;

public abstract class Funcionario {
    private double salario;
    private String nome;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularAumentoSalario();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}