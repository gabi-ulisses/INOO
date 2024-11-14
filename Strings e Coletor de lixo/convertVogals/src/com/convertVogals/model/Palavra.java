package com.convertVogals.model;

public class Palavra {
    private String palavra;

    public Palavra(){
        this.palavra = "Abacaxi";
    }

    public String getPalavra(){
        return palavra;
    }

    public int contarVogais(String palavra){

        int tam = palavra.length();
        String vogais = "aeiou";
        int contador = 0;


        for(int i = 0; i < tam; i++){
            if (palavra.substring(i, i+1).equalsIgnoreCase(vogais.substring(i, i+1))){
                contador++;
            }
        }
        return contador;
    }
}
