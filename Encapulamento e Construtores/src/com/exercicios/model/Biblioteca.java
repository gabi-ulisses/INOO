package com.exercicios.model;

public class Biblioteca {

    private DadosLivro[] livros;

    // Construtor para inicializar o array de livros
    public Biblioteca(DadosLivro[] livros) {
        this.livros = livros;
    }

    // Método para exibir a lista de livros disponíveis
    public void exibirLivrosDisponiveis() {
        boolean temDisponiveis = false;
        for (DadosLivro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getTitulo() + " - Autor: " + livro.getAutor());
                temDisponiveis = true;
            }
        }
        if (!temDisponiveis) {
            System.out.println("Nenhum livro disponível no momento.");
        }
    }

    // Método para emprestar um livro pelo título
    public void emprestarLivro(String titulo) {
        for (DadosLivro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestarLivro();
                return;
            }
        }
        System.err.println("Livro não encontrado.");
    }

    // Método para devolver um livro pelo título
    public void devolverLivro(String titulo) {
        for (DadosLivro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolverLivro();
                return;
            }
        }
        System.err.println("Livro não encontrado.");
    }
}
