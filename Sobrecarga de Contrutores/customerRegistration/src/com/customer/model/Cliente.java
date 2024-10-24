package com.customer.model;

public class Cliente {

    private String nome;
    private int idade;
    private String email;

    public Cliente(){}

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getEmail(){
        return email;
    }

}
