package com.ibag.empresa.model;

public class Programador extends Funcionario {
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.20;
    }

    @Override
    public String getCargo(){
        return "Programador";
    }
}