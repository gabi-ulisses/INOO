package com.ibag.school.model;

public abstract class Pessoa {

    protected String nome;
    protected String email;
    protected String senha;

    public Pessoa(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract void acessarSistema();
}