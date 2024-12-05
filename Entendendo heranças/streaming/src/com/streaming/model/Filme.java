package com.streaming.model;

public class Filme extends Conteudo {

    private String diretor;
    private double orcamento;

    public Filme(String titulo, int duracao, String diretor, double orcamento){
        super(titulo, duracao);
        this.diretor = diretor;
        this.orcamento = orcamento;
    }

    public String getDiretor(){
        return this.diretor;
    }

    public double getOrcamento(){
        return this.orcamento;
    }
    
    public String exibirInfo(){
       return "Titulo: " + super.getTitulo() + 
       "\nDuração: " + super.getDuracao()+
       "\nDiretor: " + getDiretor() +
       "\nOrçamento: R$" + getOrcamento();
    }
}
