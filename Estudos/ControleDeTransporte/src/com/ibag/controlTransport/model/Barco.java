package com.ibag.controlTransport.model;

public class Barco extends Transporte{
    private double comprimento;
    private double largura;
    private String bandeira;
    private int numeroTripulantes;

    public Barco(Carga carga, int diasEntrega, double comprimento, double largura, String bandeira, int numeroTripulantes) {
        super(carga, diasEntrega);
        this.comprimento = comprimento;
        this.largura = largura;
        this.bandeira = bandeira;
        this.numeroTripulantes = numeroTripulantes;
    }

    @Override
    public String toString(){
        return " Barco -> " + super.toString() + 
               ", Comprimento: "+ comprimento +  
               ", Largura: " + largura +
               ", Bandeira: " + bandeira + 
               ", Número de tripulante: " + numeroTripulantes;
    }    
}

