/*
 *  Programa que efetua a leitura de duas notas, calcula e mostra a média aritmética dessas notas. 
*/

package com.arithmeticOperators.view;

import java.util.Scanner;

import com.arithmeticOperators.model.Average;

public class ViewArithmeticAverage {
    public static void main(String[] args){

        Average m = new Average();

        Scanner ler = new Scanner(System.in);

        double nota1, nota2;

        System.out.print("Informe a primeira nota: ");
        nota1 = ler.nextDouble();  // Use nextDouble() para capturar um número decimal
        m.setNota1(nota1);

        System.out.print("Informe a segunda nota: ");
        nota2 = ler.nextDouble();  // Use nextDouble() para capturar um número decimal
        m.setNota2(nota2);

        System.out.println("Média aritmética: " + m.calcularMedia(nota1, nota2));

        ler.close();
    }
}
