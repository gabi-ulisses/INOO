package com.bicycleReservation.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private Bicicleta bicicletaReservada;
    private boolean statusReserva;
    private double saldoCreditos;

    public Usuario(String nome, String cpf, String email, String fone, double saldoCreditos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
        this.saldoCreditos = saldoCreditos;
        this.statusReserva = false; // Inicialmente sem reserva
    }

    // Método para reservar uma bicicleta
    public void reservarBicicleta(Bicicleta bicicleta) {
        if (statusReserva) {
            System.out.println("\nUsuário já possui uma bicicleta reservada.");
        } else if (bicicleta.isDisponivel()) {
            this.bicicletaReservada = bicicleta;
            bicicleta.reservar();
            this.statusReserva = true;
            System.out.println("\nBicicleta " + bicicleta.getModelo() + " reservada para " + nome);
        } else {
            System.out.println("\nBicicleta não disponível ou em manutenção.");
        }
    }

    // Método para liberar a bicicleta reservada
    public void liberarBicicleta() {
        if (statusReserva && bicicletaReservada != null) {
            bicicletaReservada.liberar();
            bicicletaReservada = null;
            statusReserva = false;
            System.out.println("\nReserva de bicicleta liberada.");
        } else {
            System.out.println("\nNão há bicicleta para liberar.");
        }
    }

    // Método para verificar saldo
    public boolean temCredito() {
        return saldoCreditos > 0;
    }
    
}
