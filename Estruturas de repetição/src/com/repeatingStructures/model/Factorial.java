package com.repeatingStructures.model;

public class Factorial {

    private  int numero;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){ 
        return numero;
    }

    public int calcFactorial(int numero){
        int fatorial = 1;
        do{
            fatorial *= numero;
            numero--;
        }while(numero > 1);

        return fatorial;
    }
}
