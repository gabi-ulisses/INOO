package com.ibag.books.model;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    /*
     *  
     * Sobrescrevendo o método toString():
     * 
     * @Override
     *  public String toString() {
     *      return "Livro: " + titulo + ", por " + autor + " (" + anoPublicacao + ").";
     * }
     * 
     */
   
}
