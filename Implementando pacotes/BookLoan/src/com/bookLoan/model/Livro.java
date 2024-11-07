package com.bookLoan.model;

public class Livro {

    private int isbn;
    private String titulo;
    private String autor;
    public boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    /*public Livro(int isbn, String titulo, String autor, boolean disponivel){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }*/

    public String getTitulo(){
        return this.titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }


}
