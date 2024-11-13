package com.bicycleReservation.view;

import com.bicycleReservation.model.Bicicleta;
import com.bicycleReservation.model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando bicicletas
        Bicicleta bike1 = new Bicicleta(1, "Mountain Bike", "Estação 1", 120.5);
        Bicicleta bike2 = new Bicicleta(2, "Speed", "Estação 2", 95.0);

        // Criando usuários
        Usuario usuario1 = new Usuario("Ana", "123456789", "ana@email.com", "11987654321", 50.0);
        Usuario usuario2 = new Usuario("Carlos", "987654321", "carlos@email.com", "11912345678", 30.0);

        // Ana tenta reservar a bike1
        usuario1.reservarBicicleta(bike1);

        // Carlos tenta reservar a mesma bike1 (deve falhar)
        usuario2.reservarBicicleta(bike1);

        // Ana libera a bike1
        usuario1.liberarBicicleta();

        // Carlos agora reserva a bike1
        usuario2.reservarBicicleta(bike1);
    }

}
