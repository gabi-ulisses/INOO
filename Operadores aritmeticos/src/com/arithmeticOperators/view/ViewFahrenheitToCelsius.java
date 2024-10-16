/*
 *  Programa que lê uma determinada temperatura em graus Fahrenheit (F), 
 *  calcula e mostra a conversão para graus Celsius (C). 
 */

package com.arithmeticOperators.view;

import java.util.Scanner;

import com.arithmeticOperators.model.ConvertTemp;

public class ViewFahrenheitToCelsius{

    public static void main(String[] args){

        ConvertTemp c = new ConvertTemp();

        Scanner ler = new Scanner(System.in);

        int Fahrenheit;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        Fahrenheit = ler.nextInt();
        c.setFahrenheit(Fahrenheit);

        System.out.printf("\n%d°F é igual a %6.0f°C\n\n",Fahrenheit,c.convert(Fahrenheit));

        ler.close();
    }
}