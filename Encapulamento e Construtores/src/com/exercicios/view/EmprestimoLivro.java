package com.exercicios.view;

import com.exercicios.model.Biblioteca;
import com.exercicios.model.DadosLivro;

public class EmprestimoLivro {
    public static void main(String[] args) {

        DadosLivro l1 = new DadosLivro("1984", "George Orwell", true);
        DadosLivro l2 = new DadosLivro("Dom Casmurro", "Machado de Assis", true);
        DadosLivro l3 = new DadosLivro("O Hobbit", "J.R.R. Tolkien", true);
        DadosLivro l4 = new DadosLivro("Memórias Póstumas de Brás Cubas", "Machado de Assis", true);
        DadosLivro l5 = new DadosLivro("A Revolução dos Bichos", "George Orwell", true);

        DadosLivro[] livros = {l1, l2, l3, l4, l5};
        Biblioteca biblioteca = new Biblioteca(livros);

        System.out.println("\nLista de livros antes do empréstimo:\n");
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.emprestarLivro("1984");
        biblioteca.emprestarLivro("O Hobbit");

        System.out.println("\nLista de livros disponíveis após o empréstimo:\n");
        biblioteca.exibirLivrosDisponiveis();

        biblioteca.devolverLivro("1984");
        biblioteca.devolverLivro("1984");

        System.out.println("\nLista de livros disponíveis:\n");
        biblioteca.exibirLivrosDisponiveis();
    }
}
