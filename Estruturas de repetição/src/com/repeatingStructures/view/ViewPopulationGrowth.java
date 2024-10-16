/*
 * 
 * Programa que calcula o crescimento populacional de um cidade até que ultrapasse o
 * número de habitantes de outra cidade.
 * 
 */
package com.repeatingStructures.view;

import com.repeatingStructures.model.PopulationGrowth;

public class ViewPopulationGrowth {
    public static void main(String[] args){

        PopulationGrowth p = new PopulationGrowth();
        
        int resultado = p.analyze(250000, 265000);

        System.out.println("São necessários "+ resultado +" anos para que a cidade 1 ultrapasse a cidade 2.");

    }
}
