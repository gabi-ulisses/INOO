/*
 *  Programa que efetua a leitura de duas notas, calcula e mostra a média ponderada dessas notas. 
 *  A primeira nota tem peso 1 e a segunda nota tem peso 2.
*/

package aula1.exercicios;

import java.util.Scanner;

public class PointedAverage {
    
    public static void main(String[] args){

        int nota1, nota2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextInt();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextInt();

        double media = ((nota1 * 1)+(nota2 * 2))/(1 + 2);
        
        System.out.println("Média: "+media);
    }
}
