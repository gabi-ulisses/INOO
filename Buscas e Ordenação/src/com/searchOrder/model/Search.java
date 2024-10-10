package com.searchOrder.model;

public class Search {

    public int binarySearch(int[] array, int numero) {
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

    public int linearSearch(int[] array, int numero) {
    
        for(int i = 0; i < 5; i++){
            if (array[i] == numero) {
                return 0;
            }
        }
        return -1;
    }
}
