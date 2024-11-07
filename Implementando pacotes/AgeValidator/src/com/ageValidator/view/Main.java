package com.ageValidator.view;

import com.ageValidator.model.Cliente;
import com.ageValidator.util.Util;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 30);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Cliente maior de idade: " + Util.Validador(cliente.getIdade()));
       }
}
