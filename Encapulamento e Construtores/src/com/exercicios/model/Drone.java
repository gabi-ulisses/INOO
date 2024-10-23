package com.exercicios.model;

public class Drone {

    private int id;
    private double distanciaPercorrida;


    public Drone(int id){
        this.id = id;
        this.distanciaPercorrida = 0.0;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getDistanciaPercorrida(){
        return distanciaPercorrida;
    }

    public void voar(double distancia){
        this.distanciaPercorrida += distancia;
    }


}