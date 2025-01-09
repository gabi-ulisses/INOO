package com.ibag.empresa.model;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(int codigo, String nome, double salario){
        super(codigo, nome, salario);
    } 
    
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularBonus() {
        bonus = super.getSalario() * 0.20;
        return bonus;
    }

    @Override
    public String getCargo(){
        return "Técnico";
    }

}

