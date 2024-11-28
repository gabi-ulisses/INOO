package com.selling.model;

import java.util.ArrayList;

public class Pedido {
   
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.produtos = new ArrayList<>();;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setProdutos(Produto p){
        this.produtos.add(p);
    }
}
