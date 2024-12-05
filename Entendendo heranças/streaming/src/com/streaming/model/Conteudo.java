package com.streaming.model;

public class Conteudo {
    private String titulo;
    private int duracao;

    public Conteudo(String titulo, int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getDuracao(){
        return this.duracao;
    }

 
}