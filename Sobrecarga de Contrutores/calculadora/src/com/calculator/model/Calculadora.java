package com.calculator.model;

public class Calculadora {

    private double n1;
    private double n2;

    public Calculadora(){
        this.n1 = 0;
        this.n2 = 0;
    }

    public Calculadora(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public double somar(double n1, double n2){
        return n1 + n2;
    }

    public double subtrair(double n1, double n2){
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public double dividir(double n1, double n2){
        if(n2 != 0){
            return n1 / n2;
        }else{
            System.out.println("Erro: Divisão por zero.");
            return 0.0;
        }
    }

    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN1(){
        return n1;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }
    public double getN2(){
        return n2;
    }
}
