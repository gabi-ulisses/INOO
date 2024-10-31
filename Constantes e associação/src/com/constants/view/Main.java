package com.constants.view;

import com.constants.model.Carro;
import com.constants.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gabrielle");
        Pessoa p2 = new Pessoa("Ana");

        Pessoa[] pessoas = {p1, p2};
        Carro carro = new Carro("Ford Ka", pessoas);
        carro.listarPessoas();
    }
}