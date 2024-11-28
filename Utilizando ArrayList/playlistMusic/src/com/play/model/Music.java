package com.play.model;

public class Music {
    private String titulo;
    private String compositor;

    public Music(String titulo, String compositor){
        this.titulo = titulo;
        this.compositor = compositor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getCompositor(){
        return this.compositor;
    }
}
