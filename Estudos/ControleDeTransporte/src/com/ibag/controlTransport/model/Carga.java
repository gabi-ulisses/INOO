package com.ibag.controlTransport.model;

public class Carga {
    private double peso;

    public Carga(double peso){
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "Peso da Carga: " + peso + "kg";
    }
}
