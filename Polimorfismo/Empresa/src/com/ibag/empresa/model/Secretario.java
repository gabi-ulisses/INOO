package com.ibag.empresa.model;

public class Secretario extends Funcionario {
    public Secretario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getCargo(){
        return "Secretário";
    }
}