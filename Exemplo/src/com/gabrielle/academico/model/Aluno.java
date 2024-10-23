package com.gabrielle.academico.model;

public class Aluno {
    public String nome;
    private int idade;

    public String getNome(){ // get: método acessor
        return nome;
    }

    public void setNome(String nome){ // set: método
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
