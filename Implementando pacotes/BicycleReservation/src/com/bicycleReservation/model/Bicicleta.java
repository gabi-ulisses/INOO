package com.bicycleReservation.model;

import java.util.Date;

public class Bicicleta {
    private int id;
    private String modelo;
    private String localizacao;
    private boolean disponivel;
    private double kmRodados;
    private String ultimaReserva;
    private boolean statusManutencao;

    public Bicicleta(int id, String modelo, String localizacao, double kmRodados) {
        this.id = id;
        this.modelo = modelo;
        this.localizacao = localizacao;
        this.kmRodados = kmRodados;
        this.disponivel = true; // Inicialmente disponível
        this.statusManutencao = false; // Inicialmente sem necessidade de manutenção
    }

    public String getModelo() {
        return modelo;
    }

    // Getters
    public boolean isDisponivel() {
        return disponivel && !statusManutencao;
    }

    public void reservar() {
        if (isDisponivel()) {
            disponivel = false;
            // Usa o método toString() para converter a data para uma string padrão
            ultimaReserva = new Date().toString();
            System.out.println("\nBicicleta " + modelo + " reservada com sucesso em " + ultimaReserva);
        } else {
            System.out.println("\nBicicleta " + modelo + " não está disponível para reserva.");
        }
    }

    public void liberar() {
        disponivel = true;
        System.out.println("\nBicicleta " + modelo + " foi liberada.");
    }

    // Método para verificar necessidade de manutenção
    public boolean precisaManutencao() {
        return statusManutencao;
    }

    // Método para ativar/desativar status de manutenção
    public void setManutencao(boolean statusManutencao) {
        this.statusManutencao = statusManutencao;
    }
}