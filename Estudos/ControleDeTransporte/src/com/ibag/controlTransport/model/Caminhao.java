package com.ibag.controlTransport.model;

public class Caminhao extends Transporte{
    private int numeroEixo;
    private String placa;
    private String cor;

    public Caminhao(Carga carga, int diasEntrega, int numeroEixo, String placa, String cor){
        super(carga, diasEntrega);
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "Tipo de tranporte: Caminhão, " + super.toString() + ", Número de eixos: "+ numeroEixo +  ", Placa: " + placa+", Cor: " + cor;
    }
}
