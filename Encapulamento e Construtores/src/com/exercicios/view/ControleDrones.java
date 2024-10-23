package com.exercicios.view;

import java.util.Random;

import com.exercicios.model.Drone;

public class ControleDrones {
    
    public static void main(String[] args) {

        Drone[] drones = new Drone[5];
        Random gerador = new Random();


        for (int i = 0; i < drones.length; i++) {
            drones[i] = new Drone(i + 1);
        }
        
        for (Drone drone : drones) {
            double distancia = gerador.nextDouble() * 100;
            drone.voar(distancia);
        }

        System.out.println("\nDistâncias percorridas pelos drones:");
        for (Drone drone : drones) {
            System.out.printf("\nDrone [ID %d]: %6.2fkm percorridos.\n", drone.getId(), drone.getDistanciaPercorrida());
        }
    }
}
