package com.streaming.view;

import com.streaming.model.Filme;
import com.streaming.model.Serie;

public class ViewConteudo {
    public static void main(String[] args) {
        Filme f1 = new Filme("Filme 1", 120, "Diretor", 200.000);
        Filme f2 = new Filme("Filme 2", 190, "Diretora", 230.000);
        Serie s1 = new Serie("Emilly in Paris", 200, 2, 10);

        System.out.println("\nFilme: \n" + f1.exibirInfo());
        System.out.println("\nFilme: \n" + f2.exibirInfo());
        System.out.println("\nSérie: \n" + s1.exibirInfo());
    }
}
