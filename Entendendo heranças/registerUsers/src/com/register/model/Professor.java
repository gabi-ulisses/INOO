package com.register.model;

public class Professor extends Pessoa {

    private String departamento;
    private int ano;

    public Professor(String nome, int cpf, String departamento, int ano){
        super(nome, cpf);
        this.departamento = departamento;
        this.ano = ano;
    }

    public String getDepartamentp(){
        return this.departamento;
    }

    public int getAno(){
        return this.ano;
    }

    public String exibirInfo(){
        return "Nome: " + super.nome + 
        "\nCPF: " + super.cpf+
        "\nDepartamento: " + departamento +
        "\nAno: " + ano;
     }
}