package com.ibag.system.view;

import com.ibag.system.model.Cliente;
import com.ibag.system.model.ClienteEspecial;
import com.ibag.system.model.Pedido;
import com.ibag.system.model.Produto;

/**
 * Classe principal que demonstra o sistema de carrinho de compras.
 */
public class SistemaCarrinho {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Ana Maria", "ana@example.com");
        ClienteEspecial cliente2 = new ClienteEspecial("Carlos Oliveira", "carlos@example.com", 10.0);

        // Criando produtos
        Produto p1 = new Produto("Notebook", 50.0);
        Produto p2 = new Produto("Mouse", 30.0);

        // Criando pedidos
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);

        Pedido pedido2 = new Pedido(cliente2);
        pedido2.adicionarProduto(p1);
        pedido2.adicionarProduto(p2);

        // Exibindo os pedidos
        System.out.println("\n" + pedido1);
        System.out.println("\n" + pedido2);

        // Demonstração do coletor de lixo
        cliente1 = null; // Cliente Ana será elegível para coleta
        System.gc(); // Solicita coleta de lixo (não garante execução imediata)
    }
}
