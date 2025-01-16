package com.ibag.zoo.model;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz Au Au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo!");
    }
}