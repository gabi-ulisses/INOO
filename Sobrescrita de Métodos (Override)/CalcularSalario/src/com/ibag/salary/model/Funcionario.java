package com.ibag.salary.model;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }
    
    // Todo funcionário, por padrão, poderá receber um bônus de 10% do salário
    public double calcularBonus() {
        return salario * 1.1;
    }

    public double getSalario(){
        return this.salario;
    }
 }