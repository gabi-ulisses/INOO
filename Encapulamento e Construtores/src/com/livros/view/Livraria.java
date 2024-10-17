package com.livros.view;

import com.livros.model.Livro;

public class Livraria {

    public static void main(String[] args) {

        Livro l = new Livro("1964", "George Orwell", 38.5);

        System.out.printf("\n Título: %s \n Autor: %s \n Preço: %6.2f\n",l.getTitulo(), l.getAutor(), l.getPreco());
    }
}
