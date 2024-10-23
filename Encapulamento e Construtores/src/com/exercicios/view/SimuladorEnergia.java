package com.exercicios.view;

import com.exercicios.model.GeradorSolar;

public class SimuladorEnergia{

    public static void main(String[] args) {
        
        GeradorSolar gerador1 = new GeradorSolar(6.0, 9.0);
        GeradorSolar gerador2 = new GeradorSolar(8.0, 13.0);

        double energiaTotal = gerador1.getEnergiaGerada() + gerador2.getEnergiaGerada();

        if(energiaTotal > 10){
            System.out.println("\nSuperavit Energético\n");

        }else{
            System.out.println("\nDéficit Energético\n");
        }
    }
}
