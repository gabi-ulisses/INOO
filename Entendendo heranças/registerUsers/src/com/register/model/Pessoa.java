package com.register.model;

public class Pessoa {
    protected String nome;
    protected int cpf;

    public Pessoa(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCPF(){
        return this.cpf;
    }
}
