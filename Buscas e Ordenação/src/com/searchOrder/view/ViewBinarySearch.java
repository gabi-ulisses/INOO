package com.searchOrder.view;

import java.util.Scanner;
import com.searchOrder.model.Search;

public class ViewBinarySearch{
    public static void main(String[] args) {
        Search search = new Search();

        Scanner ler = new Scanner(System.in);

        int array[] = {2, 4, 7, 9, 11}; // 5 elementos no array
        int numero;

        System.out.print("\nInforme um número para iniciar a busca: ");
        numero = ler.nextInt();


        int resultado = search.binarySearch(array, numero);

        if (resultado == -1) {
            System.out.println("Número não encontrado no array.");
        } else {
            System.out.println("Número "+ numero +" está na posição " + resultado + " do array!");
        }
        ler.close();

        
    }
}
