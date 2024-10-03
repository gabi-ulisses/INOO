/*
 *  Programa que realiza a busca binária em um array ordenado.
 */

package aula1.exercicios;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int array[] = {2, 4, 7, 9, 11}; // 5 elementos no array
        int numero;

        System.out.print("Informe um número para iniciar a busca: ");
        numero = entrada.nextInt();

        int resultado = buscaBinaria(array, numero);

        if (resultado == -1) {
            System.out.println("Número não encontrado no array.");
        } else {
            System.out.println("Número encontrado na posição " + resultado + " do array!");
        }
    }

    public static int buscaBinaria(int[] array, int numero) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == numero) {
                return meio;
            }

            if (array[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Número não encontrado
    }
}
