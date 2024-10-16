/*
 *  Programa que calcula o fatorial de um número fornecido pelo usuário.
 */

package com.repeatingStructures.view;

import java.util.Scanner;

import com.repeatingStructures.model.Factorial;

public class ViewFactorial {
    
    public static void main(String[] args){

        Factorial f = new Factorial();

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = ler.nextInt();
        f.setNumero(numero);

        System.out.println("\nFatorial de "+numero+": "+f.calcFactorial(numero)+"\n");
        
        ler.close();
    }
}
