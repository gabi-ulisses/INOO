package com.ibag.controlTransport.model;

public class Carga {
    private double peso;

    public Carga(double peso){
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "Capacidade da Carga: " + peso + "kg";
    }
}
