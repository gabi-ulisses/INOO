package com.register.model;

public class Estudante{
    
    private String nome;
    private int idade;
    private int prontuario;

    public Estudante(String nome, int idade, int prontuario){
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getProntuario(){
        return this.prontuario;
    }
}
