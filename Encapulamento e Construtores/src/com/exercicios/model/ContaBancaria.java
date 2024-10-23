package com.exercicios.model;

public class ContaBancaria{

    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double depositar(double valor, double saldo){
        saldo += valor;

        return this.saldo = saldo;
    }

    public double sacar(double valor, double saldo){

        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("\nSaldo insuficiente!\n");
        }

        return this.saldo = saldo;
    }
}
