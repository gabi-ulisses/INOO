package com.constants.model;

public class Carro {

    private String nome;
    private String placa;
    private Pessoa[] pessoas;
    
    public Carro(String placa, Pessoa[] pessoas){
        this.placa = placa;
        this.pessoas = pessoas;

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].setCarro(this);
        }
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Pessoa: " + pessoa.getNome() + " - Carro: " +
            pessoa.getPlaca().getNome());
        }
    }

    public void setPlaca(Carro placa){
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public Carro getPlaca(){
        return placa;
    }
        
}
