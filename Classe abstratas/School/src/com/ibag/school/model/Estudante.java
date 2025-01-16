package com.ibag.school.model;

public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String nome, String email, String senha, String matricula) {
        super(nome, email, senha);
        this.matricula = matricula;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Aluno " + nome + " está acessando o sistema.");
    }
}
