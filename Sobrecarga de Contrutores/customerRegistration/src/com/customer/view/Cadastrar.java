package com.customer.view;

import com.customer.model.Cliente;

public class Cadastrar {
    public static void main(String[] args) {

        Cliente c = new Cliente();

        System.out.println("\nMétodo sem nenhum parâmetros:\n");

        System.out.println("Nome do cliente: "+c.getNome());
        System.out.println("Idade do cliente: "+c.getIdade());
        System.out.println("E-mail do cliente: "+c.getEmail());

        c = new Cliente("Gabrielle", 20);

        System.out.println("\nMétodo com dois parâmetros:\n");

        System.out.println("Nome do cliente: "+c.getNome());
        System.out.println("Idade do cliente: "+c.getIdade());
        System.out.println("E-mail do cliente: "+c.getEmail());

        c = new Cliente("Gabrielle", 20, "gabrielle.ulisses@aluno.ifsp.edu.br");

        System.out.println("\nMétodo com três parâmetros:\n");

        System.out.println("Nome do cliente: "+c.getNome());
        System.out.println("Idade do cliente: "+c.getIdade());
        System.out.println("E-mail do cliente: "+c.getEmail());

    }
}
