package com.ibag.system.model;
import java.util.ArrayList;

public class Pedido {
    private Cliente cliente; // Associação com a classe Cliente
    private ArrayList<Produto> produtos; // Usando diretamente ArrayList

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>(); // Inicializando com ArrayList
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();  // Somando o preço de cada produto
        }

        // Aplicando desconto se o cliente tiver desconto
        double desconto = cliente.getDesconto(); // Pegando o desconto do cliente
        total = total * (1 - desconto / 100); // Aplicando desconto ao total

        return total;
    }

    @Override
    public String toString() {
        StringBuilder detalhes = new StringBuilder("Pedido de " + cliente + ":\n"); // Aqui chama o toString() de Cliente
        for (Produto produto : produtos) {
            detalhes.append("- ").append(produto).append("\n");
        }
        detalhes.append("Total: R$ ").append(calcularTotal());  // Adicionando o total
        return detalhes.toString();
    }
}
