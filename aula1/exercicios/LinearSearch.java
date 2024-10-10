/*
 *  Programa que realiza a busca linear em um array ordenado.
 */

package aula1.exercicios;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int array[] = {2,4,7,9,11}; // 5 elementos no array
        int numero;

        System.out.print("Informe um número para iniciar a busca: ");
        numero = ler.nextInt();

        for(int i = 0; i < 5; i++){
            if (array[i] == numero) {
                System.out.println("Numero encontrado na posição "+i+" do array!");
            }
        }

        ler.close();
    }
}
