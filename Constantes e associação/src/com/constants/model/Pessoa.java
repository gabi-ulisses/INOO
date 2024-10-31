package com.constants.model;

public class Pessoa {

    private String nome;
    private Carro placa;

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, Carro placa){
        this.nome = nome;
        this.placa = placa;
    }

    public String getNome(){
        return nome;
    }



}