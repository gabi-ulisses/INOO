/*
 *  Programa que efetua a leitura de duas notas, calcula e mostra a média ponderada dessas notas. 
 *  A primeira nota tem peso 1 e a segunda nota tem peso 2.
*/

package com.arithmeticOperators.view;

import java.util.Scanner;

import com.arithmeticOperators.model.PointedAverage;

public class ViewPointedAverage {

      public static void main(String[] args){

        PointedAverage mp = new PointedAverage();

        double nota1, nota2;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = ler.nextDouble();
        mp.setNota1(nota1);

        System.out.print("Informe a segunda nota: ");
        nota2 = ler.nextDouble();
        mp.setNota2(nota2);
        
        System.out.printf("\nMédia ponderada: %6.2f\n\n", mp.calcularMediaPonderada(nota1, nota2));

        ler.close();
    }
}
