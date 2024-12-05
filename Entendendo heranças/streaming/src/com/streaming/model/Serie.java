package com.streaming.model;

public class Serie extends Conteudo{

    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int duracao, int temporadas, int episodiosPorTemporada){
        super(titulo, duracao);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas(){
        return this.temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return this.episodiosPorTemporada;
    }

    public String exibirInfo(){
        return "Titulo: " + super.getTitulo() + 
        "\nDuração: " + super.getDuracao()+
        "\nTemporadas: " + getTemporadas() +
        "\nEpisódios: " + getEpisodiosPorTemporada();
     }
}
