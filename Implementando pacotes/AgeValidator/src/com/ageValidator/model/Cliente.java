package com.ageValidator.model;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}

