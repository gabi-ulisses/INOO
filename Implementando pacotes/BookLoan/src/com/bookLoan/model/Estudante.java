package com.bookLoan.model;

public class Estudante {

    private String nome;
    public Livro livro;
    public Estudante(String nome){
        this.nome = nome;
    }
    public Estudante(String nome, Livro livro){
        this.nome = nome;
        this.livro = livro;
    }

    public String getNome(){
        return this.nome;
    }

    // Método para emprestar o livro
    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            this.livro.disponivel = false;
            System.out.println("\nO livro '" + livro.getTitulo() + "' foi emprestado.");
        } else {
            System.err.println("\nO livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");
        }
    }

    // Método para devolver o livro
    public void devolverLivro() {
        if (!livro.isDisponivel()) {
            this.livro.disponivel = true;  // Marca o livro como disponível novamente
            System.out.println("\nO livro '" + livro.getTitulo() + "' foi devolvido.");
        } else {
            System.out.println("\nO livro '" + livro.getTitulo() + "' já está disponível.");
        }
    }
}

