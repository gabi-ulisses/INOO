package com.forAddress.view;

import com.forAddress.model.Cliente;
import com.forAddress.model.Endereco;
import com.forAddress.util.Util;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do Limão", 1560, "N/A", 14000123, "Araraquara", "SP");
        Cliente cliente = new Cliente("João", 30, endereco);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Cliente maior de idade: " + Util.Validador(cliente.getIdade()));
        System.out.println("Endereço: " + cliente.getEndereco().listarEndereco());
    }
}
