package com.ibag.salary.model;

public class Gerente extends Funcionario {

    public Gerente(double salario) {
        super(salario);
    }
    
    // Um gerente, de forma específica, poderá receber um bônus de 20% do salário
    @Override
    public double calcularBonus() {
        return super.getSalario() * 1.2;
    }
}