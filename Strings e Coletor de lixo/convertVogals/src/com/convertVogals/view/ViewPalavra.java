package com.convertVogals.view;

import com.convertVogals.model.Palavra;

public class ViewPalavra {
    public static void main(String[] args) {
        Palavra p = new Palavra();

        System.out.println("A palavra digitada tem "+p.contarVogais(p.getPalavra())+" vogais!");
    }
}
