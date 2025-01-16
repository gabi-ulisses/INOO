package com.ibag.school.model;

public class Professor extends Pessoa {

    private String MFA;

    public Professor(String nome, String email, String senha, String MFA) {
        super(nome, email, senha);
        this.MFA = MFA;
    }

    @Override
    public void acessarSistema() {
        if (email.equals(this.email) && senha.equals(this.senha) && MFA.equals(this.MFA)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Credenciais inválidas!");
        }
    }
}
