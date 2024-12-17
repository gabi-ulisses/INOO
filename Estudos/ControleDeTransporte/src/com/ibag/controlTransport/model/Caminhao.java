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

    public int getNumeroEixo() {
        return numeroEixo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        return " Caminhão -> " + super.toString() + 
               ", Número de eixos: "+ numeroEixo +  
               ", Placa: " + placa +
               ", Cor: " + cor;
    }
}
