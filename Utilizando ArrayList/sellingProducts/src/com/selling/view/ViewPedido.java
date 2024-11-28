package com.selling.view;

import com.selling.model.Cliente;
import com.selling.model.Pedido;
import com.selling.model.Produto;

public class ViewPedido {
    public static void main(String[] args) {
        Cliente c = new Cliente("Gabrielle");
        
        Produto p1 = new Produto("Batata", 4.95);
        Produto p2 = new Produto("Cenoura", 2.95);
        Produto p3 = new Produto("Cebola", 3.95);
        Produto p4 = new Produto("Alho", 6.95);

        Pedido p = new Pedido(c);
        
        p.setProdutos(p1);
    }
}
