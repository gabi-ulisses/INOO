package com.ticketPurchase.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String fone;

    public Cliente(String nome, String cpf, String email, String fone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    // Método para comprar um ingresso
    public void comprarIngresso(Ingresso ingresso) {
        if (ingresso.isDisponivel()) {
            ingresso.setDisponivel(false);
            System.out.println("\nIngresso para o show '" + ingresso.getNomeShow() + "' comprado com sucesso por " + nome + "!");
        } else {
            System.out.println("\nO ingresso para o show '" + ingresso.getNomeShow() + "' não está disponível.");
        }
    }
}
