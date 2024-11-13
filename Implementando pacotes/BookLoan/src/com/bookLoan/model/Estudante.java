package com.bookLoan.model;

public class Estudante {

    private String nome;
    private Livro livroEmprestado;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Método para emprestar o livro
    public void emprestarLivro(Livro livro) {
        if (livroEmprestado != null) {
            System.out.println("\n" + nome + " já possui um livro emprestado e não pode emprestar outro.");
        } else if (!livro.isDisponivel()) {
            System.out.println("\nO livro '" + livro.getTitulo() + "' não está disponível para empréstimo.");
        } else {
            this.livroEmprestado = livro;
            livro.setDisponivel(false);
            System.out.println("\n" + nome + " emprestou o livro '" + livro.getTitulo() + "'.");
        }
    }

    // Método para devolver o livro
    public void devolverLivro() {
        if (livroEmprestado != null) {
            livroEmprestado.setDisponivel(true);
            System.out.println("\n" + nome + " devolveu o livro '" + livroEmprestado.getTitulo() + "'.");
            livroEmprestado = null;
        } else {
            System.out.println("\n" + nome + " não possui nenhum livro para devolver.");
        }
    }
}
