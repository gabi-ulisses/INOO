package com.ticketPurchase.view;

import com.ticketPurchase.model.Cliente;
import com.ticketPurchase.model.Ingresso;

public class Main {
    public static void main(String[] args) {
        // Criando ingressos para shows
        Ingresso ingresso1 = new Ingresso("Rock in Rio", "12/09/2025", "Parque Olímpico", 350.00);
        Ingresso ingresso2 = new Ingresso("Lollapalooza", "23/03/2025", "Autódromo de Interlagos", 450.00);

        // Criando clientes
        Cliente cliente1 = new Cliente("Alice", "12345678910", "alice@example.com", "11987654321");
        Cliente cliente2 = new Cliente("Bruno", "10987654321", "bruno@example.com", "11912345678");

        // Cliente 1 compra ingresso
        cliente1.comprarIngresso(ingresso1); // Alice compra "Rock in Rio"

        // Cliente 2 tenta comprar o mesmo ingresso
        cliente2.comprarIngresso(ingresso1); // Bruno tenta comprar, mas não está disponível

        // Cliente 2 compra o segundo ingresso
        cliente2.comprarIngresso(ingresso2); // Bruno compra "Lollapalooza"
    }
}
