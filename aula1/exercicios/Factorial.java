/*
 *  Programa que calcula o fatorial de um número fornecido pelo usuário.
 */

package aula1.exercicios;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero, fatorial;

        
        System.out.print("Informe um número: ");
        numero = entrada.nextInt();
        
        fatorial = numero;

        System.out.printf("Fatorial de "+numero+": ");

        do{
            fatorial = fatorial *(numero - 1);
            numero--;
            System.out.print(" "+fatorial);
        }while(numero > 1);
        
    }
}
