package com.livros.model;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    // Get:

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public double getPreco(){
        return preco;
    }

    // Set:
    

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

}