package com.register.model;

public class Estudante extends Pessoa {
    private String curso;
    private int prontuario;

    public Estudante(String nome, int cpf, String curso, int prontuario){
        super(nome, cpf);
        this.curso = curso;
        this.prontuario = prontuario;
    }

    public String getCurso(){
        return this.curso;
    }

    public int getProntuario(){
        return this.prontuario;
    }

    public String exibirInfo(){
        return "Nome: " + super.nome + 
        "\nCPF: " + super.cpf+
        "\nCurso: " + curso +
        "\nOrçamento: R$" + prontuario;
     }
}
