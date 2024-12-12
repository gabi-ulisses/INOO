package com.ibag.books.view;

import java.util.ArrayList;

import com.ibag.books.model.Livro;

public class ViewLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("O investidor de bom senso", "John Bogle", 2020);
        Livro l2 = new Livro("1964", "George Orwell", 2020);
        Livro l3 = new Livro("A revolução do bichos", "George Orwell", 2020);

        ArrayList<Livro> livros = new ArrayList<>();
        
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        for (Livro l : livros){
            System.out.println("\nLivro: " + l.getTitulo() + ", por " + l.getAutor() + " (" + l.getAnoPublicacao() + ").");
        }
    }
}
