package com.ibag.system.model;

public class Cliente {
    private String nome;
    private String email;
    private String identificador;

    // Construtor principal
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.identificador = gerarIdentificador(nome); // Gerando identificador
    }

    // Sobrecarga de construtor
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "sem_email@example.com"; // Atribuindo um valor padrão para email
    }

    // Gera identificador baseado no nome (usa substring e toUpperCase)
    private String gerarIdentificador(String nome) {
        if (nome.length() < 3) {
            return nome.toUpperCase(); // Caso o nome tenha menos de 3 caracteres
        }
        return nome.substring(0, 3).toUpperCase(); // Extrai os 3 primeiros caracteres do nome
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getIdentificador() {
        return identificador;
    }

    // Método getDesconto, retornando 0 para clientes comuns
    public double getDesconto() {
        return 0;
    }

    // Método toString que agora inclui o identificador
    @Override
    public String toString() {
        return "Cliente: " + nome + " (ID: " + identificador + ")";
    }
}
