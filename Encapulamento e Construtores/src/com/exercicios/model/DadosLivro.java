package com.exercicios.model;

public class DadosLivro {

    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor para inicializar os atributos
    public DadosLivro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    // Getters (métodos para obter valores)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para emprestar o livro
    public void emprestarLivro() {
        if (isDisponivel()) {
            this.disponivel = false;  // Marca o livro como emprestado
            System.out.println("\nO livro '" + titulo + "' foi emprestado.");
        } else {
            System.err.println("\nO livro '" + titulo + "' não está disponível para empréstimo.");
        }
    }

    // Método para devolver o livro
    public void devolverLivro() {
        if (!isDisponivel()) {
            this.disponivel = true;  // Marca o livro como disponível novamente
            System.out.println("\nO livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("\nO livro '" + titulo + "' já está disponível.");
        }
    }
}
