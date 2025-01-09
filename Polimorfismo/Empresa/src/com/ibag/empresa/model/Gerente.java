package com.ibag.empresa.model;

public class Gerente extends Funcionario {
    public Gerente(String nome,double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return super.getSalario() * 0.40;
    }

    @Override
    public String getCargo(){
        return "Gerente";
    }
}