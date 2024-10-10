/*
 *  Programa que lê uma determinada temperatura em graus Fahrenheit (F), 
 *  calcula e mostra a conversão para graus Celsius (C). 
 */

package aula1.exercicios;

import java.util.Scanner;

public class FahrenheitToCelsius {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Fahrenheit;
        double Celsius;

        System.out.print("Informe a temperatura em Fahrenheit: ");
        Fahrenheit = ler.nextInt();
        Celsius = (Fahrenheit - 32)/1.8;
    
        System.out.println("Temperatura em graus Celsius: "+ Celsius +"°");

        ler.close();
    }
}
