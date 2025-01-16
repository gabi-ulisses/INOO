package com.ibag.zoo.model;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz Miau!");
    }
    @Override
    public void mover() {
        System.out.println("O gato pulou no telhado!");
    }
}