package com.ibag.zoo.view;

import com.ibag.zoo.model.Animal;
import com.ibag.zoo.model.Cachorro;
import com.ibag.zoo.model.Gato;


public class Console {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Ruffos");
        Animal gato = new Gato("Mingau");
        cachorro.emitirSom();
        cachorro.mover();
        gato.emitirSom();
        gato.mover();
    }
}