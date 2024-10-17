package com.conditionalStructures.model;

public class Parking{

    private String tipo;
    private int placa, horaEntrada, horaSaida;
    private double valorHora;

    // Set:

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setPlaca(int placa){
        this.placa = placa;
    }

    public void setHoraEntrada(int horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(int horaSaida){
        this.horaSaida = horaSaida;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    // Get:

    public String getTipo(){ 
        return tipo;
    }

    public int getPlaca(){ 
        return placa;
    }
   
    public String getHoraEntrada(){ 
        return horaEntrada;
    }
    
    public String getHoraSaida(){ 
        return horaSaida;
    }

    public String getValorHora(){ 
        return valorHora;
    }

   
    // Calculating:

    public int calculaHoras(int horaEntrada, int horaSaida){

        int horasTotal = horaSaida - horaEntrada;

        return horasTotal;
    }
        
    public double calculaValorFinal(double valorHora, int horasTotal){

        double valorFinal = valorHora + ((horasTotal - 1)*(valorHora/3));

        return valorFinal;
    }

    public double calculaDesconto(double valorFinal){

        if (valorFinal <= 20){
            valorFinal -= (valorFinal * 0.05); // Desconto de 5%
        }else if((valorFinal > 20) && (valorFinal <= 50)){
            valorFinal -= (valorFinal * 0.10); // Desconto de 10%
        }else{
            valorFinal -= (valorFinal * 0.20); // Desconto de 20%
        }

        return valorFinal;
    }
        
}
