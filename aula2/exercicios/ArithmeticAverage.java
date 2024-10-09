/*
 *  Programa que efetua a leitura de duas notas, calcula e mostra a média aritmética dessas notas. 
*/

package aula2.exercicios;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args){

        int nota1, nota2;

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = ler.nextInt();
        System.out.print("Informe a segunda nota: ");
        nota2 = ler.nextInt();

        double media = (nota1 + nota2)/2;
        
        System.out.println("Média aritmética: "+media);

        ler.close();
        
    }

    
}
