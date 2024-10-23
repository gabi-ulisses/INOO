package com.exercicios.model;

public class GeradorSolar {

    private double potenciaMaxima;
    private double energiaGerada;


    public GeradorSolar(double potenciaMaxima,double energiaGerada){
        this.potenciaMaxima = potenciaMaxima;
        this.energiaGerada = energiaGerada;
    }
    
    // Get:

    public double getPotenciaMaxima(){
        return potenciaMaxima;
    }

    public double getEnergiaGerada(){
        return energiaGerada;
    }

    // Set:
    

    public void setPotenciaMaxima(double potenciaMaxima){
        this.potenciaMaxima = potenciaMaxima;
    }

    public void setEnergiaGerada(double energiaGerada){
        this.energiaGerada = energiaGerada;
    }
}
