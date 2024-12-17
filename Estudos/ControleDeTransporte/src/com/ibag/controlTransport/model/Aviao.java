package com.ibag.controlTransport.model;

public class Aviao  extends Transporte{
    private double autonomia;

    public Aviao(Carga carga, int diasEntrega, double autonomia){
        super(carga, diasEntrega);
        this.autonomia = autonomia;
    }

    @Override
    public String toString(){
        return " Avião -> " + super.toString() + 
               ", Autonomia: "+ autonomia;
    }
}
